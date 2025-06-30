package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PublicationRequested extends AbstractEvent {

    private Long id;
    private String date;
    private String contents;
    private String title;
    private String status;
    private String authorName;
    private Long authorId;
}
