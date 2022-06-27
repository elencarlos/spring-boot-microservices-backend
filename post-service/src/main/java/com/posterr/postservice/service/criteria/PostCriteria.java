package com.posterr.postservice.service.criteria;

import lombok.Data;


@Data
public class PostCriteria {

    private String id;

    private String userId;

    private String createdAtGreaterThan;

    private String createdAtLessThan;

    private Boolean distinct;

}
