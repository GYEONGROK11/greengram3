package com.green.greengram3.feed;

import com.green.greengram3.feed.model.FeedDelDto;
import com.green.greengram3.feed.model.FeedFavDto;
import com.green.greengram3.feed.model.FeedInsDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MybatisTest // 컨테이너에 빈등록된 주소값을 가져올수있게함  - 매퍼는 객체화 됨
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//h2데이터 베이스를 사용하지 않고 야믈에 세팅한 url기준으로 테스트하겠다는 뜻
class FeedPicsMapperTest {

    @Autowired //di해줌  di : bin등록된 주소값 달라고 하는 것
    private FeedPicsMapper picsMapper;

    private FeedInsDto dto;


    public FeedPicsMapperTest(){
        this.dto= new FeedInsDto();
        this.dto.setIfeed(1);

        List<String> pics = new ArrayList<>();
        pics.add("1-1");
        this.dto.setPics(pics);
        pics.add("1-2");
    }

    @BeforeEach
    public void beforeEach(){
        FeedDelDto dto = new FeedDelDto();
        dto.setIfeed(this.dto.getIfeed());
        dto.setIuser(3);
        int affectedRows = picsMapper.feedDelPics(dto);
    }

    @Test
    void insFeedPic() {
        List<String> preList = picsMapper.feedSelPics(dto.getIfeed());
        assertEquals(0, preList.size());

        int affectedRows = picsMapper.insFeedPic(dto);

        assertEquals(dto.getPics().size(), affectedRows);

        List<String> afterList = picsMapper.feedSelPics(dto.getIfeed());

        assertEquals(dto.getPics().size(), afterList.size());

        for (int i = 0; i < dto.getPics().size(); i++) {
            assertEquals(dto.getPics().get(i), afterList.get(i));
        }

    }

}