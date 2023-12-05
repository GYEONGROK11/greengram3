package com.green.greengram3.feed;

import com.green.greengram3.common.Const;
import com.green.greengram3.common.ResVo;
import com.green.greengram3.feed.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
    public List<FeedSelVo> GetFeed(FeedSelDto dto){
        log.info("{}",dto);
        return service.feedSel(dto);
    }

    @DeleteMapping
    public ResVo delFeed(FeedDelDto dto){
        log.info("{}", dto);
        return service.delFeed(dto);
    }

    @GetMapping("/fav")
    public ResVo toggleFeedFav(FeedFavDto dto){
        return service.toggleFeedFav(dto);
    }

    @PostMapping("/comment")
    public ResVo postComment(@RequestBody FeedCommentInsDto dto){
        return service.postComment(dto);
    }

    @GetMapping("/comment")
    public List<FeedCommentSelVo> getFeedCommentAll(int ifeed){
        return service.getFeedCommentAll(ifeed);
    }



}
