package com.green.greengram3.dm;

import com.green.greengram3.common.Const;
import com.green.greengram3.common.ResVo;
import com.green.greengram3.dm.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DmService {
    private final DmMapper mapper;

    public List<DmSelVo> getDmAll(DmSelDto dto){
        List<DmSelVo> list = mapper.getDmAll(dto);
        return list;
    }

    public ResVo postDmMsg(DmMsgInsDto dto){
        int affectedRows = mapper.insDmMsg(dto);
        return new ResVo(dto.getSeq());

    }


    public List<DmMsgSelVo> getMsAll(DmMsgSelDto dto){
        List<DmMsgSelVo> list = mapper.selDmMsgAll(dto);
        return list;
    }


    public ResVo delDmMsg(DmMsgDelDto dto){
        int result = mapper.delDmMsg(dto);
        if(result == 0){
            return new ResVo(Const.FAIL);
        }

        return new ResVo(Const.SUCCESS);
    }
}
