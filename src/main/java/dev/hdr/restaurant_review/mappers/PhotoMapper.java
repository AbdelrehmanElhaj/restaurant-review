package dev.hdr.restaurant_review.mappers;

import dev.hdr.restaurant_review.domain.dtos.PhotoDto;
import dev.hdr.restaurant_review.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {

    PhotoDto toDto(Photo photo);

}

// import org.mapstruct.Mapper;
// import org.mapstruct.ReportingPolicy;
// import dev.hdr.restaurant_review.domain.dtos.PhotoDto;

// import dev.hdr.restaurant_review.domain.entities.Photo;

// @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
// public interface PhotoMapper {

//     PhotoDto toDto(Photo photo);
// }
