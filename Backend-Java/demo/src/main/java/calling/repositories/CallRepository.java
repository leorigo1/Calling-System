package calling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import calling.entities.CallEntity;

public interface CallRepository extends JpaRepository<CallEntity, Long> {

}
