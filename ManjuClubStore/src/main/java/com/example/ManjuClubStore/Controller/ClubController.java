package com.example.ManjuClubStore.Controller;
import com.example.ManjuClubStore.Domain.Club;
import com.example.ManjuClubStore.Service.ClubService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}