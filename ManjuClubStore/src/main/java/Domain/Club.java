package Domain;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Optional;

import Enum.*;
@Getter
@Setter
public class Club {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private Group group;
    private Category category;

    private Optional<String> address;
    private Optional<Integer> fee;
    private ClubSize clubSize;

    private Optional<String> contactPhone;
    private Optional<String> contactKakao;
    private Optional<String> contactInstagram;

    private boolean isMandatory;
    private ActivityDay[] activityDay;

    private String mainImage;
    private Optional<String[]> eventImage;

    private RecruitmentStatus recruitmentStatus;
    private Optional<Date> startDate;
    private Optional<Date> endDate;
    private Optional<RecruitmentType> recruitmentType;
    private Optional<String> recruitmentDetail;

    private String introduction;
    private Optional<String> post;
    private Optional<String> everytimeLink;

}
