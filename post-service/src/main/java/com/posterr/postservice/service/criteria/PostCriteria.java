package com.posterr.postservice.service.criteria;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class PostCriteria implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private LocalDate createdAtGreaterThan;

    private LocalDate createdAtLessThan;

    private Boolean distinct;

}
