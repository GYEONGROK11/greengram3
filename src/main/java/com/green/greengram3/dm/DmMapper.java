package com.green.greengram3.dm;

import com.green.greengram3.dm.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DmMapper {
    int insDm(DmInsDto dto);

    int insDmMsg(DmMsgInsDto dto);

    int insDmUser(DmUserInsDto dto);

    List<DmSelVo> getDmAll(DmSelDto dto);

    List<DmMsgSelVo> selDmMsgAll(DmMsgSelDto dto);

    int delDmMsg(DmMsgDelDto dto);
}
