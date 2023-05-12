package com.example.ManjuClubStore;

import Domain.Club;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ManjuClubStoreApplicationTests {

	@Test
	void clubDomain() {
		Club club = new Club();
		club.setFee(Optional.ofNullable(20));
		club.setContactKakao(Optional.ofNullable("dltjdgh97"));

		System.out.println(club.getFee().get());
		System.out.println(club.getContactKakao().get());
	}

}
