package com.groupeisi.gestiondate.controller;

import com.groupeisi.gestiondate.dto.UserDto;
import com.groupeisi.gestiondate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
//        UserDto user = userService.getUserById(id);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
//        UserDto createdUser = userService.createUser(userDto);
//        return ResponseEntity.ok(createdUser);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
//        userService.deleteUser(id);
//        return ResponseEntity.noContent().build();
//    }

    // Autres méthodes de contrôleur si nécessaire
}
