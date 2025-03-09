package dev.hdr.restaurant_review.services;

import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.nimbusds.jose.util.Resource;

import dev.hdr.restaurant_review.domain.entities.Photo;

public interface PhotoService {

    Photo uploadPhoto(MultipartFile file);

    Optional<Resource> getPhoto(String filename);

}
