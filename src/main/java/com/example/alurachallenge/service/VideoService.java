package com.example.alurachallenge.service;

import com.example.alurachallenge.model.entities.Video;
import com.example.alurachallenge.model.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository repository;

    public List<Video> listAll(){
        return repository.findAll();
    }

}
