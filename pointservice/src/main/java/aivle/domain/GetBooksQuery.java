package aivle.domain;

import java.util.Date;
import lombok.Data;

@Data
public class GetBooksQuery {

    private Long id;
    private String bookName;
    private String category;
    private Boolean isBestSeller;
    private String authorName;
    private String image;
    private Integer subscriptionCount;
    private String bookContent;
    private String authorId;
    private String pdfPath;
}
