package com.example.streaming;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;




    @GetMapping("/list")
    public List<String> readAllVideoUrl(){
        return videoRepository.getAllVideoUrl();
    }


}
