package com.example.streaming;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Getter
@Setter
@Document(collection = "video_list")
public class Video {

    public String id;
    private String title;
    private String url;
    private String on;

    public Video(){

    }


    public Video(String id, String title, String url, String on) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.on = on;
    }
}
