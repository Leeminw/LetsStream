package com.example.streaming;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path = "/video")
@RequiredArgsConstructor
public class VideoController {

    @Autowired
    VideoService videoService;

    private final VideoRepository videoRepository;

    @GetMapping
    public String showVideoList(Model model){
//        return videoService.findAllVideos();
        List<Video> videos = videoRepository.findAll();
        model.addAttribute("videos",videos);
        return "basic/videoList";

    }


    @GetMapping("/{videoTitle}")
    public String video(@PathVariable String videoTitle, Model model){
        Video video = videoRepository.findByTitle(videoTitle);
        model.addAttribute("video",video);
        return "basic/videoDetail";
    }


}
