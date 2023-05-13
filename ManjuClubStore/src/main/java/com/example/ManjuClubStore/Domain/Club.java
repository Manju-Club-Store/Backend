package com.example.ManjuClubStore.Domain;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import com.example.ManjuClubStore.Enum.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;
import java.util.OptionalInt;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Club {

    public Club(String name, Group group, String address, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.group = group;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @Column(name= "grp")
    private Group group;

    @Nullable
    private String address;


    @Nullable
    private LocalDate startDate;
    @Nullable
    private LocalDate endDate;

    private String profileImage;



}

/*
    private Category category;
    @Nullable
    private int fee;

    private ClubSize clubSize;
    @Nullable
    private String contactPhone;
    @Nullable
    private String contactKakao;
    @Nullable
    private String contactInstagram;

    private boolean isMandatory;
    //private ActivityDay[] activityDay;
    private String mainImage;
    //@Nullable private String[] eventImage;

    private RecruitmentStatus recruitmentStatus;
    private RecruitmentType recruitmentType;
    private String recruitmentDetail;

    private String introduction;
    @Nullable
    private String post;
    @Nullable
    private String everytimeLink;

    private int heartCount;


 */