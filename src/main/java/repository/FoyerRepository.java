package repository;

import entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}