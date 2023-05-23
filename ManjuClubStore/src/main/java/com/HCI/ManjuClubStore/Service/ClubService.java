package com.HCI.ManjuClubStore.Service;

import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    public String saveProfileImage(MultipartFile file)
        throws IOException{
            String fileName = file.getOriginalFilename();
            String fileUrl = fileDir + fileName;

            file.transferTo(new File(fileUrl));
            return fileUrl;
        }



}