package com.HCI.ManjuClubStore;

import com.HCI.ManjuClubStore.Domain.Club;
import com.HCI.ManjuClubStore.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.HCI.ManjuClubStore.Enum.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class ManjuClubStoreApplication implements CommandLineRunner {

	@Autowired
	ClubService clubService;
	public static void main(String[] args) {
		SpringApplication.run(ManjuClubStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Club Aqui = new Club(
				null,
				"Aqui",
				Affiliation.CENTRAL,
				Category.MUSIC,
				"제2학생회관 B124호",
				10000,
				ClubSize.tento25,
				"01031342219",
				"kaminoki",
				"@bandaqui",
				Arrays.asList(ActivityDay.MONDAY, ActivityDay.TUESDAY),
				"http://13.124.30.238:8080/Image/Club/Aqui/Main/Aqui.JPG",
				Arrays.asList(
						"http://13.124.30.238:8080/Image/Club/Aqui/Event/Aqui_1.jpeg",
						"http://13.124.30.238:8080/Image/Club/Aqui/Event/Aqui_2.jpeg"
				),
				true,
				RecruitmentStatus.RECRUITING,
				new Date(1684076400L * 1000),
				new Date(1684681200L * 1000),
				"10명 내외",
				RecruitmentType.LINK,
				"https://docs.google.com/forms/d/1ROenAfRgEvZlDJNzHdKJK0OSuQJc1DufCpXzBdwiNIc/closedform",
				"락 밴드",
				"https://everytime.kr/367430/v/290050399",
				35,
				"\uD83D\uDD25D-1 건국대학교 중앙동아리 락밴드 AQUI아퀴 2023 신입 부원 1차 모집 \uD83D\uDD25아퀴는 실력보다 열정을 중요시합니다. 부담없이, 고민없이 많은 지원 바랍니다!!!안녕하세요! 건국대학교 중앙동아리 락밴드 AQUI아퀴 입니다! 2023년 아퀴에서 함께할 신입부원을 모집합니다\uD83C\uDFB8\uD83E\uDD1F\uD83D\uDD25️ ✔모집 분야보컬(남, 여)/드럼/일렉기타/베이스기타/건반(신디사이저)✔️ 모집 일정-2/13(월)~3/1(수): 1차 영상 지원-3/5(일) : 1차 합격자 발표(합불 일괄 문자 발송 예정)-3/9(목)~10(금): 2차 대면 면접*1차 합격자분들을 대상으로 추후 일정 재공지 하겠습니다.✔️ 지원 방법<1차 영상 제출>지원 폼 먼저 작성해주신 후 이메일로 양식에 맞추어 지원영상을 보내주시면 됩니다!\uD83C\uDF1F \uD83D\uDD25[필독] 지원시 유의 사항 \uD83D\uDD25\uD83C\uDF1F- 신청 폼 작성 후 영상 제출시 이메일 제목은 반드시 <이름 - 세션> 을 제목으로 해주세요(지원 기간 내 영상 미제출 시 자동 불합격 처리됩니다.)- 본인 확인을 위해 영상 첫 부분에 카메라에 얼굴이 나오게 하신 후 \"(본인성명) 아퀴 지원 영상입니다.\" 를 말씀하시고 시작해주시기 바랍니다.(나머지 촬영 동안에는 얼굴 노출이 되지 않아도 괜찮습니다.)- 지원 폼 작성과 영상 메일을 모두 확인하는 즉시 확인문자를 발송해드릴 예정입니다.\uD83C\uDFB5보컬\uD83C\uDFB5지정곡 중 택 1곡 1절 + 자유곡 1곡 완곡으로, 총 2곡 영상 보내주시면 됩니다.\uD83C\uDF1F지정곡\uD83C\uDF1F< 남자보컬 >don’t look back in anger – oasisPlug in baby – musefuel – metallica< 여자보컬 >sk8er boi – avril Lavigne낭만고양이 – 체리필터Bad romance – halestorm\uD83C\uDFB8보컬 제외 세션\uD83C\uDFB8자유곡 1곡 완곡 영상 보내주시면 됩니다!세션 지원자에 한해, 완곡 제출이 어려울 경우 임원진에게 연락 바랍니다.\uD83C\uDF1F지원 폼 링크\uD83C\uDF1Fhttps://forms.gle/XjGaUmUMXtSnUbLD9\uD83C\uDF1F영상 제출 이메일\uD83C\uDF1Fbandaqui7@gmail.com<2차 면접>1차 영상 면접 합격자분들을 대상으로 추후 일정과 장소 안내드릴 예정입니다. 2차 면접에서 직접 연주를 보진 않으며 구술면접으로 간단히 진행될 예정입니다!\uD83C\uDF1F2차 면접 평가 기준\uD83C\uDF1F태도(열정과 의지)(50%) 실력(30%) 장르적 개방성(20%)‐-----------------------------------------------✔️ AQUI는 어떤 동아리 인가AQUI는 밴드에 대한 \uD83D\uDD25열정과 의지\uD83D\uDD25 를 최우선으로 봅니다! 실력이 부족하다고 생각하거나 아직 개인악기가 없다는 이유로 지원을 망설이지 않으셔도 됩니다!\uD83C\uDFB5 부원 모두의 의견을 존중하여 선곡합니다. 하드 락, 메탈, 얼터너티브 락, 그런지 락 등 강렬한 밴드 음악\uD83C\uDFB8\uD83E\uDD1F과 팝, 모던 락, 인디, 댄스 음악 등\uD83C\uDFB6 제한 없이 다양한 장르의 곡을 하고 있습니다.✔️AQUI 활동 소개AQUI는 작년 두번의 정기공연과 연합공연, 대동제와 세종대와의 연합공연 등 다양한 공연을 많이 진행했습니다!음악 취향이 비슷한 동아리원들과 함께 다양한 장르의 곡을 준비하며 즐거움을 느끼실 수 있습니다!✔️ 동아리방 소개AQUI의 동방은 제 2 학생회관 지하 1층 124호로 일감호에 있는 다리(홍예교)를 건너 지하로 들어가는 입구로 들어오시면 됩니다!방음 패널에 다양한 장비가 구비되어 있어 개인연습 및 합주가 가능합니다!✔️공식 유튜브 채널https://youtube.com/@aqui8249‐----------------------------------------------❗️< 임원진 연락처 >회장 최서윤 01087647670부회장 박연주 01085974604문의사항이나 안내가 필요한 부분이 생기셨을시 편하게 임원진에게 연락부탁드립니다!"
		);
		Club Oxen = new Club(
				null,
				"Oxen",
				Affiliation.CENTRAL,
				Category.MUSIC,
				"제1학생회관 옥슨 부실",
				15000,
				ClubSize.tento25,
				"01031342219",
				"kaminoki",
				"@oxeneverdie",
				Arrays.asList(ActivityDay.MONDAY, ActivityDay.WEDNESDAY, ActivityDay.FRIDAY),
				"http://13.124.30.238:8080/Image/Club/Oxen/Main/Oxen.png",
				Arrays.asList(
						"http://13.124.30.238:8080/Image/Club/Oxen/Event/Oxen_1.jpg",
						"http://13.124.30.238:8080/Image/Club/Oxen/Event/Oxen_2.jpg"
				),
				true,
				RecruitmentStatus.COMPLETED,
				null,
				null,
				"6~8명",
				RecruitmentType.LINK,
				"https://docs.google.com/forms/d/1ROenAfRgEvZlDJNzHdKJK0OSuQJc1DufCpXzBdwiNIc/edit",
				"중앙 정책 밴드",
				"https://everytime.kr/367430/v/290061472",
				45,
				"안녕하세요. 건국대학교 그룹사운드 OXEN 입니다.\uD83D\uDD2546th OXEN OPEN\uD83D\uDD25건국대학교의 유일한 [중앙 정책 동아리 밴드]OXEN과 함께할 46기 신입 부원을 모집합니다!1차 오디션은 2월 1일부터 2월 28일까지 진행되며개강 후 순차적으로 2차 오디션을 진행해3월 초에 최종 선발을 마칠 예정입니다!——————❤️\u200D\uD83D\uDD25 오디션 설명❤️\u200D\uD83D\uDD25 ————————\uD83D\uDCCD 모집 대상나이, 학번에 관계없이 함께 음악을 즐길 수 있는 분을 찾습니다!이번 학기엔 보컬(남/여), 기타, 베이스, 키보드 세션을 모집합니다.실력이 부족하더라도 열정을 가지고 계시다면 부담 없이 지원해주세요 ㅎㅎ\uD83D\uDCCD 오디션 일정\uD83D\uDCCD 1차 오디션https://docs.google.com/forms/d/1ROenAfRgEvZlDJNzHdKJK0OSuQJc1DufCpXzBdwiNIc/edit위 구글폼 작성 후 1차 오디션 영상을 oxeneverdie@gmail.com 로 제출해주세요!메일 제목양식은 [세션/학과/이름/1차 오디션 곡 제목] 입니다.예)- 제목 예시 -[보컬/밴드과/김건국/박하사탕]- 내용 예시 -안녕하세요.보컬 세션 지원한 밴드과 김건국입니다.제가 선택한 곡은 [YB - 박하사탕] 입니다.1차 오디션 영상 제출합니다!감사합니다.세션마다 지원 방법과 지정곡 등이 상이하니 아래 내용 확인 부탁드려요 :)- 1차 오디션 기한 : 2/1 ~ 2/28 11:59 pm- 1차 오디션 합격자 발표 : 3/2 개별 연락\uD83D\uDCCD 세션 별 1차 오디션 지정곡————————————————————————\uD83C\uDFA4 보컬(남)1. 이적 - 하늘을 달리다2. 버즈 - Monologue3. YB - 박하사탕4. 쏜애플 - 행복한 나를5. 잔나비 - See Your Eyes5개 지정곡 중 택1 하여 지원\uD83C\uDFA4 보컬(여)1. 정경화 - 나에게로의 초대2. 자우림 - 미안해 널 미워해3. 윤하 - 사건의 지평선4. Naomi Scott - Speechless5. Bishop Briggs - River5개 지정곡 중 택1 하여 지원\uD83C\uDFB8 기타1차 - 자유곡2차 - 자유곡서로 다른 곡을 각각 1개씩 준비\uD83C\uDFB8 베이스1차 - 자유곡2차 - 자유곡서로 다른 곡을 각각 1개씩 준비\uD83C\uDFB9 키보드키보드 세션은 1차 오디션 영상 제출 없이바로 2차 오디션 (대면면접) 진행합니다!2차 - 자유곡 1곡, 지정곡 1곡 총 2곡지정곡) IU - Strawberry Moon자유곡 1곡 + 지정곡 1곡 준비해서구글 폼 작성해주시면 개별 연락 드리겠습니다!————————————————————————\uD83D\uDCCD 2차 오디션- 제 1 학생회관 옥슨 부실에서 대면 면접 진행합니다.- 자유곡 1곡 연주 준비 해오시면 됩니다! (키보드는 지정곡 1곡 포함 2곡)- 1차 합격자 대상 스케줄 조율 후 개별 연락 예정- 최종 합격자 발표 : 3월 2째 주 이내\uD83D\uDCCD 문의사항문의는 인스타그램 @oxeneverdie로 인스타그램 dm 혹은 회장 010-7354-0328로 연락주세요!(최대한 빠르게 답장 드리겠습니다!)———————❤️\u200D\uD83D\uDD25 OXEN 안내서❤️\u200D\uD83D\uDD25————————1978년에 결성된 옥슨은 40여 년 동안 홍서범 선배님을 비롯한 유명 인사들을 배출하며 학교 안팎에서 활발하게 활동해온 밴드입니다. 이 같은 대외적인 활동과 활약을 인정받아 보통의 중앙 동아리보다는 한 단계 승격된 중앙 정책 동아리로써 학교 차원에서 공식 밴드부로 인정받습니다.옥슨은 밴드 사운드에 기반한 음악을 합니다. 옥슨이 지향하는 장르는 어느 한 가지에 국한되어 있지 않으며 밴드 세션 모두가 참여할 수 있는 음악을 추구합니다!2023년에는 건국대학교에서 주최하는 성신의 예술제와 대동제에 참여할 예정이며 또한 동아리 자체적으로 1학기와 2학기 방학 기간에 옥슨 단독 공연 및 타 대학 밴드부들과의 연합 공연을 진행할 예정입니다.공연 영상은 유튜브에 ‘건국대학교 그룹사운드 OXEN’이라고 검색하시면 볼 수 있습니다.\uD83D\uDCCD 옥슨 유튜브 페이지https://youtube.com/channel/UC4MBlPh_MDd80KYqj0b6dHw\uD83D\uDCCD옥슨 공연 영상\uD83D\uDD25 윤하 - 살별https://youtu.be/fv7U5xYOR7o\uD83D\uDD25 강산에 - 거꾸로 강을 거슬러 오르는 저 힘찬 연어들처럼https://youtu.be/VnBg7jJo4lk\uD83D\uDD25 무한궤도 - 그대에게https://youtu.be/Ug68jiEafMU\uD83D\uDCCD 옥슨 인스타그램https://instagram.com/oxeneverdie?igshid=YmMyMTA2M2Y=여러분의 많은 지원 기다리겠습니다."
		);
		Club Soriter = new Club(
				null,
				"소리터",
				Affiliation.CENTRAL,
				Category.MUSIC,
				"제2학생회관 B126호",
				5000,
				ClubSize.moreThan100,
				"01031342219",
				"kaminoki",
				"@soritor_official",
				Arrays.asList(ActivityDay.TUESDAY),
				"http://13.124.30.238:8080/Image/Club/소리터/Main/소리터.jpg",
				new ArrayList<>(), // No event images given
				false,
				RecruitmentStatus.ALWAYS,
				null,
				null,
				"모집 인원 제한 없음",
				RecruitmentType.LINK,
				"https://docs.google.com/forms/d/e/1FAIpQLSdEyaaGRxPx6rxrsQeBuJktJDJv68aiyEe_EPeSgCxuzQFMsw/viewform?usp=sf_link",
				"밴드",
				"https://everytime.kr/418770/v/290391197",
				80,
				"안녕하세요!!! 건국대학교 중앙밴드동아리 소리터에서 43기를 모집합니다.\uD83C\uDFB8 모집 대상 \uD83C\uDFB8- 음악을 좋아하고 밴드 활동에 대한 열정이 가득한 부원을 모집합니다!!!!!- 기본적 밴드 구성 보컬, 기타, 베이스, 드럼, 키보드 등등을 포함한 모든 세션들을 모집합니다.- 나이, 학번 상관 없이 모집합니다.- 노래를 잘 부르지 못해도 혹은 악기를 잘 다루지 못해도 열정만 있다면 괜찮아요!- 저희는 동아리 부원들끼리 레슨도 진행합니다. 경험 있는 부원들이 최선을 다해서 도와드리니 걱정하지 마세요!!!!- 다른 세션에 비해 보컬은 인기가 많기 때문에 간단한 질문이 있을 수도 있습니다. \uD83D\uDE00- 지원하는 세션 인원 수에 따라 빠르게 마감될 수 있는 점 양해부탁드립니다...\uD83C\uDFB8 동아리 시설 \uD83C\uDFB8- 저희 소리터는 휴게실과 합주실로 두개의 동아리 시설을 보유하고 있습니다.\uD83D\uDE0D\uD83D\uDE0D- 제 1 학생회관 402-4호 = 휴게실언제든 오셔서 쉬다 갈 수 있는 동아리 방 입니다.평소 시간에 뜨거나, 밥 먹을 장소가 마땅치 않거나 하시면 언제든 들어오세요!!- 제2학생회관 지하 B-126 = 합주실앰프와 다양한 악기가 구비되어 있습니다.다른 팀과 겹치지 않으면 언제든지 개인적으로 사용 가능합니다.!!!!\uD83C\uDFA4동아리 운영\uD83C\uDFA4- 팀 체제로 운영되며, 자율적으로 팀을 구성하거나 처음인 분들을 위하여 집행부에서 팀을 짜드리기도 합니다.- 팀을 같이 하고 싶은 친구끼리 활동하셔도 됩니다!\uD83C\uDFB9동아리 활동\uD83C\uDFB9- 학교 축제(대동제, 성신예술제 등)와 외부 공연장에서 공연 등 정기 공연- 타동아리, 타학교들과의 연합공연- 엠티, 번개모임, 친목모임- 버스킹- 락, 가요, 팝, 블루스, 재즈 등등 장르에 관계 없이 누구에게나 열려있습니다 \uD83D\uDE0D\uD83C\uDFB8모집기간,방법\uD83C\uDFB8회장 : 김유섭 (010-9149-4339)부회장 : 김령은 (010-8455-1871)구글 폼 작성 링크:https://docs.google.com/forms/d/e/1FAIpQLSdEyaaGRxPx6rxrsQeBuJktJDJv68aiyEe_EPeSgCxuzQFMsw/viewform?usp=sf_link- 구글 폼 작성하셔서 제출하시면 추후에 회장이나 부회장이 개인적으로 연락드리겠습니다.지원양식1. 이름, 학번, 학과, 나이2. 전화번호3. 지원하고자 하는 세션4. 좋아하는 장르나 아티스트,밴드,가수(여러 개 적어주셔도 됩니다!)5. 악기/밴드 활동 경험 유무(경험이 있다면 기간까지 적어주세요!)6. 지원동기(짧아도 괜찮아요!)[기타 궁금한 점은 댓글로 문의 주시거나 회장 및 부회장에게 편하게 연락 주세요~]"
		);

		Club Sunyul = new Club(
				null,
				"선율",
				Affiliation.CENTRAL,
				Category.MUSIC,
				"제2학생회관 B137호",
				20000,
				ClubSize.twentyFiveTo50,
				"01031342219",
				"kaminoki",
				"@ku_sunyul",
				Arrays.asList(ActivityDay.TUESDAY, ActivityDay.FRIDAY),
				"http://13.124.30.238:8080/Image/Club/선율/Main/선율.jpg",
				Arrays.asList("http://13.124.30.238:8080/Image/Club/선율/Event/선율_1.jpg"),
				false,
				RecruitmentStatus.RECRUITING,
				new Date(1684076400L * 1000),
				new Date(1684681200L * 1000),
				"20~30명",
				RecruitmentType.LINK,
				"https://docs.google.com/forms/d/e/1FAIpQLSdEyaaGRxPx6rxrsQeBuJktJDJv68aiyEe_EPeSgCxuzQFMsw/viewform?usp=sf_link",
				"피아노",
				"https://everytime.kr/367430/v/292083668",
				15,
				"\uD83C\uDFB9 선율 새맞주 신입부원모집\uD83D\uDC25\n" +
						"안녕하세요!!피아노를 사랑하는 사람들이 모여 만드는 아름다운 소리, 건국대학교 \uD83C\uDFB9피아노 중앙동아리 선율입니다!이번학기 새내기맞이주간에도 \uD83C\uDF39선율 홍보부스\uD83C\uDF39가 열립니다~온라인 모집에 이어 오프라인으로 새맞주 기간에 23학년도 1학기 신입부원을 모집하니 많은 지원 바랍니다.\uD83D\uDCEE\uD83C\uDF52도전 랜덤 플레이\uD83C\uDF52 이벤트도 진행하니 \uD83C\uDF4E아름다운 피아노 선율\uD83C\uDF4E을 들으며 이벤트도 즐기고 \uD83C\uDF6B경품\uD83C\uDF6B도 받아가세요!\uD83C\uDFB9부스 진행 일정부스는 3/7(수)~ 3/8(목) \uD83C\uDF39오전 10시부터 오후 5시까지\uD83C\uDF39청심대 앞에서 진행됩니다.부스에서는 선율 지원서 작성이 가능하며, 다양한 상품이 준비된 이벤트를 진행합니다.\uD83D\uDEA9\uD83D\uDEA9▫️오프라인 지원 이후 추가적인 모집이 없을 예정이니 모집 일정 내에 꼭 신청해주세요!⏰️\uD83C\uDFB9이벤트 소개\uD83C\uDF52도전 랜덤 플레이\uD83C\uDF52참여자가 제비 뽑기를 통해 뽑은 곡을 연주하는 게임입니다. \uD83C\uDFB9 연주곡의 난이도는 ✈️비행기 수준의 쉬운 곡이 대다수이니 주저하지 말고 도전해보세요!\uD83D\uDD25\uD83C\uDF6C준비된 경품\uD83C\uDF6C다양한 종류의 까까\uD83C\uDF6B\uD83C\uDF6D\uD83C\uDF70\uD83D\uDCE3모든 이벤트에 대해, 준비된 경품이 소진될 시, 해당 경품의 이벤트는 조기 종료될 수 있습니다.\uD83C\uDFB9모집일정* 새내기 맞이 주간 서류 접수 : 3/7(화)~ 3/8(수) 새맞주 부스에서 접수하시면 됩니다.* 서류 합격문자 발송 : 3/8(수)* 서류 합격자 면접 : 3/9(목)~ 3/14(화)* 최종 합격문자 발송 : 3/14(화)\uD83C\uDF39 이번학기 선율 개강 총회✨️는 3/16(목) 18:00 ~ 19:00 에 예정되어 있습니다. \uD83C\uDF39\uD83C\uDFB9선율 지원 방법[Step 1]3/7(화) ~ 3/8(수), 선율의 새내기 맞이 주간 부스에 와서 간단한 지원서를 제출한다.[Step 2]3/8(수) 새맞주 종료 후, 개인 연락처로 발송된 서류 합격 문자로 면접에 대한 안내문자를 확인한다!\uD83C\uDF4E\uD83C\uDFB9면접안내3/8(수)에 서류 합격자 분들께 연락처로 면접 안내 공지를 보내드립니다. 면접은 대면으로 간략한 질문 몇 가지를 통해 진행됩니다! 이번 학기 면접장소는 케이큐브 혹은 동방에서 진행될 예정입니다!\uD83D\uDC25\uD83C\uDFB9회비안내선율 회비는 \"25,000원\"으로, 임시적으로 오픈 채팅방에 신입 회원분들을 초대한 후 회비 납부 확인이 되면 공지방과 수다방에 초대해드립니다.\uD83C\uDFB9기타문의궁금한 점은 아래 오픈채팅방 링크를 통해 편하게 물어봐 주세요!⭐️오픈 채팅방 링크➡️ https://open.kakao.com/o/svKxzwse선율의 활동이 좀 더 알고 싶다 하시는 분들은 선율 공식 인스타그램 계정과 선율 네이버 카페에서 많은 사진, 연주 동영상 등을 확인하실 수 있습니다!⭐️선율 인스타그램➡️ @ku_sunyul 검색⭐️선율 네이버 카페➡️ https://m.cafe.naver.com/sunyulkonkuk\uD83C\uDFB9홍보부스 위치"
		);

		clubService.save(Aqui);
		clubService.save(Oxen);
		clubService.save(Soriter);
		clubService.save(Sunyul);
	}



}
