package com.groupeisi.gestiondate.repository;

import com.groupeisi.gestiondate.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    // Ajoutez des méthodes de requête personnalisées si nécessaire
}
