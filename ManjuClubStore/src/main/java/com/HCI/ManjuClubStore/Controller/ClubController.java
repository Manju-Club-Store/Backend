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
import java.util.List;

@RestController
public class ClubController {

    @Autowired
    private ClubService clubService;



    @PostMapping("/club")
    public ResponseEntity<String> saveClub(@RequestParam("club") String clubData,
                                           @RequestParam("mainImage")MultipartFile mainImage) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Club club = null;

        try{
            club = objectMapper.readValue(clubData, Club.class);
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }

        String mainUrl = clubService.saveProfileImage(mainImage);
        club.setMainImage(mainUrl);

        clubService.save(club);
        return ResponseEntity.ok("club saved");
    }

    @GetMapping("/clubs")
    public List<Club> getAllClubs() {
        return clubService.findAll();
    }

    @Value("${file.dir}")
    private String fileDir;

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