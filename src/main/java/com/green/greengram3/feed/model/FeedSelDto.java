package com.green.greengram3.feed.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class FeedSelDto {

    private int startIdx;
    private int rowCount;
}
