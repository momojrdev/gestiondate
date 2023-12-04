package com.groupeisi.gestiondate.mapping;

import com.groupeisi.gestiondate.dto.HistoryDto;
import com.groupeisi.gestiondate.entity.HistoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoryMapper {
    HistoryDto toHistoryDto(HistoryEntity historyEntity);
    HistoryEntity toHistoryEntity(HistoryDto historyDto);

    List<HistoryDto> toHistoryDtoList(List<HistoryEntity> histories);
}
