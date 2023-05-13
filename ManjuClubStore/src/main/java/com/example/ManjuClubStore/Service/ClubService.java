package com.example.ManjuClubStore.Service;

import com.example.ManjuClubStore.Domain.Club;
import com.example.ManjuClubStore.Repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    public Club save(Club club){
        return clubRepository.save(club);
    }

}