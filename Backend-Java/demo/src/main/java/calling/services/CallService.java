package calling.services;

import org.springframework.stereotype.Service;

import calling.DTOS.ChamadoCreateDTO;
import calling.entities.CallEntity;
import calling.entities.UserEntity;
import calling.repositories.CallRepository;
import calling.repositories.UserRepository;

@Service
public class CallService {
	
	private UserRepository userRepository;
    private CallRepository callRepository;
	
	public CallEntity criar(ChamadoCreateDTO dto) {

	    UserEntity usuario = userRepository.findById(dto.getUsuarioId())
	        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

	    CallEntity chamado = new CallEntity();
	    chamado.setTitulo(dto.getTitulo());
	    chamado.setDescricao(dto.getDescricao());
	    chamado.setCategoria(dto.getCategoria());
	    chamado.setPrioridade(dto.getPrioridade());
	    chamado.setUsuario(usuario);

	    return callRepository.save(chamado);
	}
}