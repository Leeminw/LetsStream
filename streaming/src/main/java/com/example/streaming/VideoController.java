package com.example.streaming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @GetMapping
    public List<Video> showVideoList(){
        return videoService.findAllVideos();
    }


    @GetMapping(value = "/find")
    public String findVideoData(@RequestParam String title){
        return videoService.selectVideo(title);
    }



}
