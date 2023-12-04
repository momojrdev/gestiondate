package com.groupeisi.gestiondate.mapping;

import com.groupeisi.gestiondate.dto.CalculationDto;
import com.groupeisi.gestiondate.entity.CalculEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CalculationMapper {
    CalculationDto toCalculationDto(CalculEntity calculationEntity);
    CalculEntity toCalculationEntity(CalculationDto calculationDto);

    List<CalculationDto> toCalculationDtoList(List<CalculEntity> calculations);
}
