package aivle.domain;

import aivle.MenuscriptserviceApplication;
import aivle.domain.ScriptSaved;
import aivle.domain.TemporaryscriptSaved;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Manuscript_table")
@Data
//<<< DDD / Aggregate Root
public class Manuscript {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String contents;

    private String title;

    private String status;

    private String authorName;

    private Long authorId;

    @PostPersist
    public void onPostPersist() {
        ScriptSaved scriptSaved = new ScriptSaved(this);
        scriptSaved.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        TemporaryscriptSaved temporaryscriptSaved = new TemporaryscriptSaved(
            this
        );
        temporaryscriptSaved.publishAfterCommit();
    }

    public static ManuscriptRepository repository() {
        ManuscriptRepository manuscriptRepository = MenuscriptserviceApplication.applicationContext.getBean(
            ManuscriptRepository.class
        );
        return manuscriptRepository;
    }

    //<<< Clean Arch / Port Method
    public void requestPublish(RequestPublishCommand requestPublishCommand) {
        //implement business logic here:

        PublicationRequested publicationRequested = new PublicationRequested(
            this
        );
        publicationRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void notifyStatus(PublishPrepared publishPrepared) {
        //implement business logic here:

        /** Example 1:  new item 
        Manuscript manuscript = new Manuscript();
        repository().save(manuscript);

        */

        /** Example 2:  finding and process
        
        // if publishPrepared.gptIdmanuscriptId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> publishingMap = mapper.convertValue(publishPrepared.getGptId(), Map.class);
        // Map<Long, Object> publishingMap = mapper.convertValue(publishPrepared.getManuscriptId(), Map.class);

        repository().findById(publishPrepared.get???()).ifPresent(manuscript->{
            
            manuscript // do something
            repository().save(manuscript);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
