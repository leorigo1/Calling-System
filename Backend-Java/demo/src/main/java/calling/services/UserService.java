package calling.services;

import org.springframework.stereotype.Service;

import calling.entities.UserEntity;
import calling.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	
	public UserEntity createUser (UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

    public UserEntity findUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
	
	public void deleteUser (UserEntity userEntity) {
		userRepository.delete(userEntity);
	}
}
