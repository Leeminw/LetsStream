package com.example.streaming;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoRepository{

    @Autowired
    JdbcTemplate jdbcTemplate ;

    public List<String> getAllVideoUrl() {
        List<String> videourlList = new ArrayList<>();
        videourlList.addAll(jdbcTemplate.queryForList("SELECT url from videos.video_content;",String.class));
        return videourlList;

    }
}