package dev.hdr.restaurant_review.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.hdr.restaurant_review.domain.dtos.PhotoDto;
import dev.hdr.restaurant_review.domain.entities.Photo;
import dev.hdr.restaurant_review.mappers.PhotoMapper;
import dev.hdr.restaurant_review.services.PhotoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/photos")
public class PhotoController {

    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public PhotoDto uploadPhoto( @RequestParam("file") MultipartFile file) {
        
        Photo savedPhoto = photoService.uploadPhoto(file);
        
        return photoMapper.toDto(savedPhoto);
    }
}
