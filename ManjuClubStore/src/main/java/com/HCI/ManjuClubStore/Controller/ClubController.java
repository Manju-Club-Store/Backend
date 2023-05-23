package com.HCI.ManjuClubStore.Controller;
import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Service.ClubService;
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

    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @PostMapping("/club")
    public Club saveClub(@RequestBody Club club) {
        return clubService.save(club);
    }

    @GetMapping("/clubs")
    public List<Club> getAllClubs() {
        return clubService.findAll();
    }

    @Value("${file.dir}")
    private String fileDir;

    @PostMapping("/uploadProfileImage/{clubId}")
    public ResponseEntity<String> uploadProfileImage(@PathVariable Long clubId, @RequestParam("file")MultipartFile file)
    throws IOException{
        String fileName = file.getOriginalFilename();
        String fileUrl = fileDir + fileName;
       // Path imagePath = Paths.get(fileUrl);


        //Files.write(imagePath, file.getBytes());
        file.transferTo(new File(fileUrl));
        clubService.saveProfileImage(clubId, fileUrl);

        return new ResponseEntity<>(HttpStatusCode.valueOf(100));
    }
}