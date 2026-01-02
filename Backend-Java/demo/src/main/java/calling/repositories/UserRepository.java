package calling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import calling.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
