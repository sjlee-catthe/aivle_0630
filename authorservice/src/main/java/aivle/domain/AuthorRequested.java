package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorRequested extends AbstractEvent {

    private Long id;
    private String authorName;
    private String email;
    private String introduce;
    private Boolean isApprove;
    private String introduction;
    private String portfolioUrl;
    private Boolean isApproved;

    public AuthorRequested(Author aggregate) {
        super(aggregate);
    }

    public AuthorRequested() {
        super();
    }
}
//>>> DDD / Domain Event
