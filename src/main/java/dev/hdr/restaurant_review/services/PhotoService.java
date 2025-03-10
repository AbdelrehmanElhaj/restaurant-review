package dev.hdr.restaurant_review.services;

import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.core.io.Resource;

import dev.hdr.restaurant_review.domain.entities.Photo;

public interface PhotoService {

    Photo uploadPhoto(MultipartFile file);

    public Optional<Resource> getPhotoAsResource(String id);

}
