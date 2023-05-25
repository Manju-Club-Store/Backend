package com.HCI.ManjuClubStore.Service;

import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    public List<Club> findAll(){
        return clubRepository.findAll();
    }
    public Club save(Club club){
        return clubRepository.save(club);
    }


    @Value("${file.dir}")
    private String fileDir;

    public String decodeImage(String image, String imageName) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(image);
        String imageUrl = saveImage(decodedBytes, imageName);

        return imageUrl;

    }

    public String saveImage(byte[] imageBytes, String imageName) throws IOException {
        String fileUrl = fileDir + imageName;

        try (FileOutputStream imageOutFile = new FileOutputStream(fileUrl)) {
            imageOutFile.write(imageBytes);
        }
        return fileUrl;
    }
}