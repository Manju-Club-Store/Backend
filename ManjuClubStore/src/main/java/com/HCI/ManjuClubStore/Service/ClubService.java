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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    @Value("${dbfile.dir}")
    private String dbfileDir;

    public byte[] decodeImage(String image) {
        return Base64.getDecoder().decode(image);
    }

    public String saveImage(byte[] imageBytes, String imageName, String clubName) throws IOException {
        String fileUrl = fileDir + clubName;

        Path path = Paths.get(fileUrl);
        //해당 동아리 폴더가 없는 경우
        if(!Files.exists(path))
            Files.createDirectory(path);

        fileUrl += "/" + imageName;

        try (FileOutputStream imageOutFile = new FileOutputStream(fileUrl)) {
            imageOutFile.write(imageBytes);
        }

        fileUrl = dbfileDir + clubName + "/" + imageName;
        return fileUrl;
    }
}