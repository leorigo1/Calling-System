package calling.services;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import calling.DTOS.ChamadoCreateDTO;
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

    public CallEntity criar(ChamadoCreateDTO dto) {

        CallEntity chamado = new CallEntity();
        chamado.setTitulo(dto.getTitulo());
        chamado.setDescricao(dto.getDescricao());
        chamado.setCategoria(dto.getCategoria());
        chamado.setCallingPriority(dto.getCallingPriority());
        
        Instant ZonaBrasil = ZonedDateTime
				.now(ZoneId.of("America/Sao_Paulo"))
				.toInstant();
        chamado.setDataCriacao(ZonaBrasil);

        return callRepository.save(chamado);
    }
    
    public List<CallEntity> listarTodosChamados () {
    	return callRepository.findAll();
    }
}