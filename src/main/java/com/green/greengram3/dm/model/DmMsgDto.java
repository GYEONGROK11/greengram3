package com.green.greengram3.dm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class DmMsgDto {
    private int page;
    private int fromIuser;
    private int toIuser;
    @JsonIgnore
    private int startIdx;
    @JsonIgnore
    private int rowCount;

}
