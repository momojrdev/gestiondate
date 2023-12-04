package com.groupeisi.gestiondate.repository;

import com.groupeisi.gestiondate.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntity, Integer> {
    List<HistoryEntity> findByUserId(int userId);
    // Ajoutez des méthodes de requête personnalisées si nécessaire
}
