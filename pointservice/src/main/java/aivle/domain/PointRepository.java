package aivle.domain;

import aivle.domain.*;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "points", path = "points")
public interface PointRepository
    extends PagingAndSortingRepository<Point, Long> {
    @Query(
        value = "select point " +
        "from Point point " +
        "where(:id is null or point.id = :id) and (:point is null or point.point = :point) and (:applyingId is null or point.applyingId = :applyingId) and (:userId is null or point.userId = :userId)"
    )
    Point getPoints(
        Long id,
        Integer point,
        ApplyingId applyingId,
        UserId userId
    );
}
