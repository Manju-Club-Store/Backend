package com.HCI.ManjuClubStore.Controller;
import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Service.ClubService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
public class ClubController {

    @Autowired
    private ClubService clubService;

    @Value("${file.dir}")
    private String fileDir;

    @PostMapping("/club")
    public ResponseEntity<String> saveClub(@RequestBody Club club) throws IOException {

        // Assuming club.getMainImage() is a base64 encoded String
        String mainImage = club.getMainImage();
        byte[] decodedBytes = Base64.getDecoder().decode(mainImage);

        // Save main image
        String mainImageUrl = clubService.saveImage(decodedBytes, "mainImage.jpg");
        club.setMainImage(mainImageUrl);

        // Assuming club.getEventImages() is a list of base64 encoded Strings
        List<String> eventImages = club.getEventImages();
        List<String> eventImageUrls = new ArrayList<>();
        int i = 1;
        for (String eventImage : eventImages) {
            decodedBytes = Base64.getDecoder().decode(eventImage);
            String imageUrl = clubService.saveImage(decodedBytes, "eventImage" + i + ".jpg");
            eventImageUrls.add(imageUrl);
            i++;
        }
        club.setEventImages(eventImageUrls);

        clubService.save(club);
        return ResponseEntity.ok("Club saved");
    }


    @GetMapping("/clubs")
    public List<Club> getAllClubs() {
        return clubService.findAll();
    }

    /*
    @PostMapping("/uploadProfileImage/{clubId}")
    public ResponseEntity<String> uploadProfileImage(@PathVariable Long clubId, @RequestParam("file")MultipartFile file)
    throws IOException{
        String fileName = file.getOriginalFilename();
        String fileUrl = fileDir + fileName;
       // Path imagePath = Paths.get(fileUrl);


        //Files.write(imagePath, file.getBytes());
        file.transferTo(new File(fileUrl));
        clubService.saveProfileImage(fileUrl);

        return new ResponseEntity<>(HttpStatusCode.valueOf(100));
    }*/
}