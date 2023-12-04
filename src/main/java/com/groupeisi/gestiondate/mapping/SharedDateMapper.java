package com.groupeisi.gestiondate.mapping;

import com.groupeisi.gestiondate.dto.SharedDateDto;
import com.groupeisi.gestiondate.entity.SharedDateEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SharedDateMapper {
    SharedDateDto toSharedDateDto(SharedDateEntity sharedDateEntity);
    SharedDateEntity toSharedDateEntity(SharedDateDto sharedDateDto);

    List<SharedDateDto> toSharedDateDtoList(List<SharedDateEntity> sharedDates);
}
