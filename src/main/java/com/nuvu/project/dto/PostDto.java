package com.nuvu.project.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PostDto {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

}

