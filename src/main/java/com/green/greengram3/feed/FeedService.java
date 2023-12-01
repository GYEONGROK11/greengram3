package com.green.greengram3.feed;

import com.green.greengram3.common.ResVo;
import com.green.greengram3.feed.model.FeedInsDto;
import com.green.greengram3.feed.model.FeedSelDto;
import com.green.greengram3.feed.model.FeedSelVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;
    private final FeedPicsMapper picsMapper;

    public ResVo postFeed(FeedInsDto dto){
        mapper.insFeed(dto);
        picsMapper.insFeedPic(dto);
        return new ResVo(dto.getIfeed());
    }

    public List<FeedSelVo> feedSel(FeedSelDto dto){
        List<FeedSelVo> list = mapper.feedSel(dto);

        for (FeedSelVo vo : list) {
            vo.setPics(picsMapper.feedSelPics(vo.getIfeed()));

        }
        return list;
    }
}
