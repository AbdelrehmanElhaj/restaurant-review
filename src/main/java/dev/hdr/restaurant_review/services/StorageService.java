package dev.hdr.restaurant_review.services;

import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.nimbusds.jose.util.Resource;

public interface StorageService {

    String store(MultipartFile file, String filename);

    Optional<Resource> loadResource(String filename);

}
