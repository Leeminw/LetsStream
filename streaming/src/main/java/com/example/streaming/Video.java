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

}
