package aivle.domain;

import aivle.domain.*;
import aivle.infra.AbstractEvent;
import java.util.*;
import lombok.*;

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
    private Object manuscriptId;
    private Long price;
}
