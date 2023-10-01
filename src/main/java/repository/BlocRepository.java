package repository;

import entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}