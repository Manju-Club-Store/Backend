package com.example.ManjuClubStore;

import com.example.ManjuClubStore.Domain.Club;
import com.example.ManjuClubStore.Service.ClubService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ManjuClubStoreApplicationTests {

	@Autowired
	ClubService clubService;

	@Test
	void saveClub() {
		clubService.save(new Club("taekwondo", 15000));
		clubService.save(new Club("roman surf", 30000));
		clubService.save(new Club("youth hostel", 20000));
	}
}
