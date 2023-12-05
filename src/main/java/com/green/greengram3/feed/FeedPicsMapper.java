package com.green.greengram3.feed;

import com.green.greengram3.feed.model.FeedDelDto;
import com.green.greengram3.feed.model.FeedInsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedPicsMapper {
    int insFeedPic(FeedInsDto dto);

    List<String> feedSelPics(int ifeed);

    int feedDelPics(FeedDelDto dto);
}
