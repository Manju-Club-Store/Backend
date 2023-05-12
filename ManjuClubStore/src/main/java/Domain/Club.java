package Domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import Enum.*;
@Getter
@Setter
@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "group")
    private Group group;
    @Column(name = "category")
    private Category category;

    @Nullable
    @Column(name = "address")
    private String address;
    @Nullable
    @Column(name = "fee")
    private int fee;
    @Column(name = "club_size")
    private ClubSize clubSize;


    @Nullable
    @Column(name = "contact_phone")
    private String contactPhone;
    @Nullable
    @Column(name = "contact_kakao")
    private String contactKakao;
    @Nullable
    @Column(name = "contact_instagram")
    private String contactInstagram;

    @Column(name = "is_mandatory")
    private boolean isMandatory;
    //@Column(name = "activity_day")
    //private ActivityDay[] activityDay;


    @Column(name = "main_image")
    private String mainImage;
    //@Nullable
    //@Column(name = "event_image")
    //private String[] eventImage;

    @Column(name = "recruitment_status")
    private RecruitmentStatus recruitmentStatus;
    @Nullable
    @Column(name = "start_date")
    private Date startDate;
    @Nullable
    @Column(name = "end_date")
    private Date endDate;
    @Nullable
    @Column(name = "recruitment_type")
    private RecruitmentType recruitmentType;
    @Nullable
    @Column(name = "recruitment_detail")
    private String recruitmentDetail;

    @Column(name = "introduction")
    private String introduction;
    @Nullable
    @Column(name = "post")
    private String post;
    @Nullable
    @Column(name = "everytime_link")
    private String everytimeLink;

}
