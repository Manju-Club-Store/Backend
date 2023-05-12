package Domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Optional;

@Getter
@Setter
public class Club {


    private long id;

    private String name;
    //private ENUM group
    //private String category;

    private Optional<String> address;
    private Optional<Integer> fee;
    //private clubSize

    private Optional<String> contactPhone;
    private Optional<String> contactKakao;
    private Optional<String> contactInstagram;

    private boolean isMandatory;
    //priavte activity;

    private String mainImage;
    private Optional<String[]> eventImage;

    //private recruitmentStatus;
    private Optional<Date> startDate;
    private Optional<Date> endDate;
    //private Optional<> recruitmentType;
    private Optional<String> recruitmentDetail;

    private String introduction;
    private Optional<String> post;
    private Optional<String> everytimeLink;

}
