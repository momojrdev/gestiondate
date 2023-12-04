package com.groupeisi.gestiondate.repository;

import com.groupeisi.gestiondate.entity.CalculEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<CalculEntity, Integer> {
    // Ajoutez des méthodes de requête personnalisées si nécessaire
}
