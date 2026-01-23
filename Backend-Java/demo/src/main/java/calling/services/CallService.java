package calling.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import calling.DTOS.ChamadoCreateDTO;
import calling.DTOS.ChamadoResponseDTO;
import calling.entities.CallEntity;
import calling.repositories.CallRepository;
import calling.repositories.UserRepository;

@Service
public class CallService {
	

    private final UserRepository userRepository;
    private final CallRepository callRepository;

    public CallService(UserRepository userRepository,
                       CallRepository callRepository) {
        this.userRepository = userRepository;
        this.callRepository = callRepository;
    }

    private CallEntity criarEntity(ChamadoCreateDTO dto) {

        CallEntity chamado = new CallEntity();
        chamado.setTitulo(dto.getTitulo());
        chamado.setDescricao(dto.getDescricao());
        chamado.setCategoria(dto.getCategoria());
        chamado.setCallingPriority(dto.getCallingPriority());
        chamado.setDataCriacao(Instant.now());

        chamado.setUsuario(
            userRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"))
        );

        return callRepository.save(chamado);
    }

    public ChamadoResponseDTO criar(ChamadoCreateDTO dto) {

        CallEntity chamado = criarEntity(dto);

        ChamadoResponseDTO response = new ChamadoResponseDTO();
        response.setId(chamado.getId());
        response.setTitulo(chamado.getTitulo());
        response.setDescricao(chamado.getDescricao());
        response.setCategoria(chamado.getCategoria());
        response.setCallingPriority(chamado.getCallingPriority());
        response.setDataCriacao(chamado.getDataCriacao());
        response.setUsuarioId(chamado.getUsuario().getId());
        response.setNomeUsuario(chamado.getUsuario().getName());

        return response;
    }

    public List<CallEntity> listarTodosChamados() {
    	return callRepository.findAll();
    }
    
    public Optional<CallEntity> detalharChamado(Long id) {
    	return callRepository.findById(id);
    }
    
    
}
