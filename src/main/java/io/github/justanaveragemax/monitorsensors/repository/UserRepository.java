package io.github.justanaveragemax.monitorsensors.repository;

import io.github.justanaveragemax.monitorsensors.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  @EntityGraph(attributePaths = "roles")
  Optional<User> findByEmail(String email);

}
