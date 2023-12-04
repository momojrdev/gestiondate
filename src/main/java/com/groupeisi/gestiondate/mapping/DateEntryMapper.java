package com.groupeisi.gestiondate.mapping;

import com.groupeisi.gestiondate.dto.DateEntryDto;
import com.groupeisi.gestiondate.entity.DateEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DateEntryMapper {
    DateEntryDto toDateEntryDto(DateEntity dateEntryEntity);
    DateEntity toDateEntryEntity(DateEntryDto dateEntryDto);

    List<DateEntryDto> toDateEntryDtoList(List<DateEntity> dateEntries);
}
