package com.HCI.ManjuClubStore;

import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Service.ClubService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class ManjuClubStoreApplicationTests {

	@Autowired
	ClubService clubService;

	@Test
	void saveClub() {

//		clubService.save(new Club("youth hostel",  null,"120-503", null, LocalDate.now()));

/*
clubService.save(Club.builder()
				.name("youth hostel")
				.address("120-503")
				.group(Group.Central)
				.startDate(LocalDate.now())
				.endDate(LocalDate.now())
				.build());
clubService.save(new Club( Long.valueOf(1241), "youth hostel", Group.Central
				, Category.VOLUNTEER, "102-503", 15000
				, ClubSize.twentyFiveTo50, null, null, null, true,
				"Dummy Main Image", RecruitmentStatus.Always
				, RecruitmentType.Link, "Google Form",null,
				null, "Hello guys",null,  null,  124));

						clubService.save(Club.builder()
				.name("youth hotel")
				.group(Group.Central)
				.category(Category.VOLUNTEER)
				.address("102-503")
				.fee(15000)
				.clubSize(ClubSize.tento25)
				.contactPhone(null)
				.contactKakao(null)
				.contactInstagram(null)
				.isMandatory(true)
				.mainImage("Dummy Main Image")
				.recruitmentStatus(RecruitmentStatus.Always)
				.recruitmentType(RecruitmentType.Link)
				.recruitmentDetail("Google Form")
				.startDate(null)
				.endDate(null)
				.introduction("hello guys")
				.post(null)
				.everytimeLink(null)
				.heartCount(124)
				.build());

*/




	//	clubService.save(new Club("roman surf", 30000, "Seoul"));
	//	clubService.save(new Club("youth hostel", 20000, "102-503"));
	}


}
