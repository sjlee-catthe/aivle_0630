package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PublishPrepared extends AbstractEvent {

    private Long id;
    private String coverImagePath;
    private String summaryContent;
    private String bookName;
    private String pdfPath;
    private String authorId;
    private String authorName;
    private String category;
    private Boolean notifyStatus;
    private ManuscriptId manuscriptId;
    private Long price;

    public PublishPrepared(Publishing aggregate) {
        super(aggregate);
    }

    public PublishPrepared() {
        super();
    }
}
//>>> DDD / Domain Event
