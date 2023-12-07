package com.green.greengram3.dm;

import com.green.greengram3.common.ResVo;
import com.green.greengram3.dm.model.DmMsgDto;
import com.green.greengram3.dm.model.DmMsgSelVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dm")
@Tag(name = "디엠 API",description = "디엠 관련 처리")
public class DmContoller {

    //page, fromIuser, toIuser
    //page = 1  - 방이있는 경우 - 대화리스트 응답
    //          - 방이없는 경우 - 방만들기 - 빈 대화리스트 응답
    //page = 1이상 - 방이 있다 - 대화리스트 응답
    @GetMapping("/msg")
    public List<DmMsgSelVo> getMsAll(DmMsgDto dto){
        log.info("dto : {}",dto);
        return null;
    }

}
