package calling.services;

import org.springframework.stereotype.Service;

import calling.entities.UserEntity;
import calling.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public void createUser (UserEntity userEntity) {
		userRepository.save(userEntity);
	}
	
	public void findUserById (UserEntity userEntity) {
		userRepository.findById(userEntity.getId());
	}
	
	public void deleteUser (UserEntity userEntity) {
		userRepository.delete(userEntity);
	}
	
	
}
