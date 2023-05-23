package com.HCI.ManjuClubStore.Service;

import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    public List<Club> findAll(){
        return clubRepository.findAll();
    }
    public Club save(Club club){
        return clubRepository.save(club);
    }

    public void saveProfileImage(Long clubId, String fileUrl) {
        Optional<Club> tmp = clubRepository.findById(clubId);
        Club club = tmp.get();
        club.setMainImage(fileUrl);
        clubRepository.save(club);
    }
}