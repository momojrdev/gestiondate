package com.groupeisi.gestiondate.mapping;

import com.groupeisi.gestiondate.dto.UserDto;
import com.groupeisi.gestiondate.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(UserEntity userEntity);
    UserEntity toUserEntity(UserDto userDto);

    List<UserDto> toUserDtoList(List<UserEntity> users);
}
