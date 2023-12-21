package com.green.greengram3.dm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class DmMsgDelDto {
    private int idm;
    private int seq;
    private int iuser;

}
