package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BestsellerRegistered extends AbstractEvent {

    private Long id;
    private String bookName;
    private Boolean isBestSeller;
    private String authorName;
    private String image;
    private String bookContent;
    private String authorId;
    private Integer subscriptionCount;
    private String category;
    private String pdfPath;
    private String applyingid;
    private String isPurchase;
    private String status;
    private String userid;

    public BestsellerRegistered(Book aggregate) {
        super(aggregate);
    }

    public BestsellerRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
