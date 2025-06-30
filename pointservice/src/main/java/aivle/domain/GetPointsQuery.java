package aivle.domain;

import java.util.Date;
import lombok.Data;

@Data
public class GetPointsQuery {

    private Long id;
    private Integer point;
    private ApplyingId applyingId;
    private UserId userId;
}
