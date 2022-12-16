package com.example.streaming;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VideoRepository extends MongoRepository<Video,String> {
    Video findByTitle(String title);

}
