package com.example.ManjuClubStore;

import com.example.ManjuClubStore.Domain.Club;
import com.example.ManjuClubStore.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ManjuClubStoreApplication implements CommandLineRunner {

		@Autowired
		ClubService clubService;

	public static void main(String[] args) {

		SpringApplication.run(ManjuClubStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clubService.save(new Club("Aqui", 300));
		clubService.save(new Club("Youth Hostel", 500));
		clubService.save(new Club("Kuphil", 700));
	}

}
