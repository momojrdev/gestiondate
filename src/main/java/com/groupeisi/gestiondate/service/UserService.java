package com.groupeisi.gestiondate.service;

import com.groupeisi.gestiondate.dto.UserDto;
import com.groupeisi.gestiondate.entity.UserEntity;
import com.groupeisi.gestiondate.mapping.UserMapper;
import com.groupeisi.gestiondate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDto> getAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return userMapper.toUserDtoList(users);
    }

//    public UserDto getUserById(int id) {
//        Optional<UserEntity> userOptional = userRepository.findById(id);
//        return userOptional.map(userMapper::toUserDto).orElse(null);
//    }
////
//    public UserDto createUser(UserDto userDto) {
//        UserEntity userEntity = userMapper.toUserEntity(userDto);
//        UserEntity savedUser = userRepository.save(userEntity);
//        return userMapper.toUserDto(savedUser);
//    }
//
//    public void deleteUser(int id) {
//        userRepository.deleteById(id);
//    }

    // Autres méthodes de service si nécessaire
}
