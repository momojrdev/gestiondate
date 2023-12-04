package com.groupeisi.gestiondate.repository;

import com.groupeisi.gestiondate.entity.DateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateEntryRepository extends JpaRepository<DateEntity, Integer> {
    // Ajoutez des méthodes de requête personnalisées si nécessaire
}
