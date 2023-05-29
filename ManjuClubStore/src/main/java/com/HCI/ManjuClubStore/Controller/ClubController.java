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

        String mainImage = club.getMainImage();
        byte[] imageBytes = clubService.decodeImage(mainImage);
        String imageUrl = clubService.saveImage(imageBytes, "mainImage.png", club.getName());
        club.setMainImage(imageUrl);

        List<String> eventImages = club.getEventImages();
        List<String> eventImageUrls = new ArrayList<>();

        int i = 1;
        for (String eventImage : eventImages) {
            imageBytes = clubService.decodeImage(eventImage);
            imageUrl = clubService.saveImage(imageBytes, "eventImage" + i + ".png", club.getName());
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

}