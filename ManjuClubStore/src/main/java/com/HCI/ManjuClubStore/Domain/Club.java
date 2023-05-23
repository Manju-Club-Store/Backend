package com.HCI.ManjuClubStore.Domain;
import jakarta.persistence.*;
import lombok.*;
import com.HCI.ManjuClubStore.Enum.*;

import java.util.Date;
import java.util.List;


@Getter @Setter
@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Affiliation affiliation;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String address; // Can be null

    private Integer fee; // Can be null

    @Enumerated(EnumType.STRING)
    private ClubSize clubSize;

    private String contactPhone; // Can be null
    private String contactKakao; // Can be null
    private String contactInstagram; // Can be null

    @ElementCollection(targetClass = ActivityDay.class)
    @CollectionTable(name = "activity_day", joinColumns = @JoinColumn(name = "club_id"))
    @Column(name = "activity_day")
    @Enumerated(EnumType.STRING)
    private List<ActivityDay> activityDay;

    private String mainImage;

    @ElementCollection
    private List<String> eventImages;

    @Column(nullable = false)
    private Boolean isMandatory;

    @Enumerated(EnumType.STRING)
    private RecruitmentStatus recruitmentStatus;

    @Temporal(TemporalType.DATE)
    private Date startDate; // Can be null

    @Temporal(TemporalType.DATE)
    private Date endDate; // Can be null

    @Column(nullable = false)
    private String recruitmentSize;

    @Enumerated(EnumType.STRING)
    private RecruitmentType recruitmentType;

    @Column(nullable = false)
    private String recruitmentDetail;

    @Column(nullable = false)
    private String introduction;

    private String everytimeLink; // Can be null

    @Column(nullable = false)
    private Integer heartCount = 0;

    @Column(length = 5000)
    private String post; // Can be null

    // Constructor, getters, and setters are the same as before, just add for new fields


    public Club() {
    }

    public Club(Long id, String name, Affiliation affiliation, Category category, String address, Integer fee, ClubSize clubSize, String contactPhone, String contactKakao, String contactInstagram, List<ActivityDay> activityDay, String mainImage, List<String> eventImages, Boolean isMandatory, RecruitmentStatus recruitmentStatus, Date startDate, Date endDate, String recruitmentSize, RecruitmentType recruitmentType, String recruitmentDetail, String introduction, String everytimeLink, Integer heartCount, String post) {
        this.id = id;
        this.name = name;
        this.affiliation = affiliation;
        this.category = category;
        this.address = address;
        this.fee = fee;
        this.clubSize = clubSize;
        this.contactPhone = contactPhone;
        this.contactKakao = contactKakao;
        this.contactInstagram = contactInstagram;
        this.activityDay = activityDay;
        this.mainImage = mainImage;
        this.eventImages = eventImages;
        this.isMandatory = isMandatory;
        this.recruitmentStatus = recruitmentStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recruitmentSize = recruitmentSize;
        this.recruitmentType = recruitmentType;
        this.recruitmentDetail = recruitmentDetail;
        this.introduction = introduction;
        this.everytimeLink = everytimeLink;
        this.heartCount = heartCount;
        this.post = post;
    }

}
