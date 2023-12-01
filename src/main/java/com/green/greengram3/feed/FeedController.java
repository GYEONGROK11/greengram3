package com.green.greengram3.feed;

import com.green.greengram3.common.Const;
import com.green.greengram3.common.ResVo;
import com.green.greengram3.feed.model.FeedInsDto;
import com.green.greengram3.feed.model.FeedSelDto;
import com.green.greengram3.feed.model.FeedSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/feed")
@Tag(name = "피드 API",description = "피드 관련 처리")
public class FeedController {
    private final FeedService service;

    @Operation(summary = "피드 등록",description = "피드 등록 처리")
    @PostMapping
    public ResVo postFeed(@RequestBody FeedInsDto dto){
        return service.postFeed(dto);
    }

    @Operation(summary = "피드 리스트",description = "피드 등록 처리")
    @GetMapping
    public List<FeedSelVo> GetFeed(int page){
        FeedSelDto dto = FeedSelDto.builder()
                .startIdx((page-1) * Const.FEED_COUNT_PER_PAGE)
                .rowCount(Const.FEED_COUNT_PER_PAGE)
                .build();
        return service.feedSel(dto);
    }


}
