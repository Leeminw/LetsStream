package com.example.streaming;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video,String> {
    Video findByTitle(String title);
}
