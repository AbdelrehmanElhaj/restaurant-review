package dev.hdr.restaurant_review.services.impl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nimbusds.jose.util.Resource;

import dev.hdr.restaurant_review.domain.entities.Photo;
import dev.hdr.restaurant_review.services.PhotoService;
import dev.hdr.restaurant_review.services.StorageService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final StorageService storageService;
    
    @Override
    public Photo uploadPhoto(MultipartFile file) {
        String photoId = UUID.randomUUID().toString();
        String url = storageService.store(file, photoId);
        
        return Photo.builder()
                .url(url)
                .uploadedDate(LocalDateTime.now())
                .build();
    }

    @Override
    public Optional<Resource> getPhoto(String filename) {
        return storageService.loadResource(filename);
    }
    

}
