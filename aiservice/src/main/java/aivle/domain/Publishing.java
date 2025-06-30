package aivle.domain;

import aivle.AiserviceApplication;
import aivle.domain.PublishPrepared;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Publishing_table")
@Data
//<<< DDD / Aggregate Root
public class Publishing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String coverImagePath;

    private String summaryContent;

    private String bookName;

    private String pdfPath;

    private String authorId;

    private String authorName;

    private String category;

    private Boolean notifyStatus;

    private Long price;

    @Embedded
    private ManuscriptId manuscriptId;

    public static PublishingRepository repository() {
        PublishingRepository publishingRepository = AiserviceApplication.applicationContext.getBean(
            PublishingRepository.class
        );
        return publishingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void publish(PublicationRequested publicationRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Publishing publishing = new Publishing();
        repository().save(publishing);

        PublishPrepared publishPrepared = new PublishPrepared(publishing);
        publishPrepared.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if publicationRequested.authorId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<Long, Object> manuscriptMap = mapper.convertValue(publicationRequested.getAuthorId(), Map.class);

        repository().findById(publicationRequested.get???()).ifPresent(publishing->{
            
            publishing // do something
            repository().save(publishing);

            PublishPrepared publishPrepared = new PublishPrepared(publishing);
            publishPrepared.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
