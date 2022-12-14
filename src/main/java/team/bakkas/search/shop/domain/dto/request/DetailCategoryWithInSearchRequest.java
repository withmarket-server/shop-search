package team.bakkas.search.shop.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import team.bakkas.search.shop.domain.vo.DetailCategory;

/**
 * @author Doyeop Kim
 * @version 0.0
 * @since 2022/11/05
 */
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DetailCategoryWithInSearchRequest {
    @JsonProperty("detail_category")
    private DetailCategory detailCategory;

    private Double latitude;

    private Double longitude;

    private Double distance;

    private String unit;

    private Integer page;

    private Integer size;

    public static DetailCategoryWithInSearchRequest of(final DetailCategory detailCategory, final Double latitude, final Double longitude, final Double distance,
                                                       final String unit, final Integer page, final Integer size) {

        return DetailCategoryWithInSearchRequest.builder()
                .detailCategory(detailCategory)
                .latitude(latitude)
                .longitude(longitude)
                .distance(distance)
                .unit(unit)
                .page(page)
                .size(size)
                .build();
    }
}
