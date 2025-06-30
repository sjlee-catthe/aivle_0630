package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TemporaryscriptSaved extends AbstractEvent {

    private Long id;
    private String date;
    private String contents;
    private Long authorId;
    private String title;
    private String status;
    private String authorName;

    public TemporaryscriptSaved(Manuscript aggregate) {
        super(aggregate);
    }

    public TemporaryscriptSaved() {
        super();
    }
}
//>>> DDD / Domain Event
