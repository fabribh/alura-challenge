package com.example.alurachallenge.model.repository;

import com.example.alurachallenge.model.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
