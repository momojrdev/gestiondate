package com.groupeisi.gestiondate.repository;

import com.groupeisi.gestiondate.entity.SharedDateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SharedDateRepository extends JpaRepository<SharedDateEntity, Integer> {
    List<SharedDateEntity> findByUserId(int userId);
    // Ajoutez des méthodes de requête personnalisées si nécessaire
}
