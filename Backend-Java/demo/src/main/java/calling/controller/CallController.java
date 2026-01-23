package calling.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.DTOS.ChamadoCreateDTO;
import calling.DTOS.ChamadoResponseDTO;
import calling.entities.CallEntity;
import calling.repositories.CallRepository;
import calling.services.CallService;

@RestController
@RequestMapping("/call")
@CrossOrigin(origins = "http://localhost:4200")
public class CallController {

    private final CallRepository callRepository;

    private final CallService callService;

    public CallController(CallService callService, CallRepository callRepository) {
        this.callService = callService;
        this.callRepository = callRepository;
    }

    @PostMapping("/create-call")
    public ResponseEntity<ChamadoResponseDTO> criarChamado(
            @org.springframework.web.bind.annotation.RequestBody ChamadoCreateDTO dto) {

        ChamadoResponseDTO chamado = callService.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(chamado);
    }
    
    @GetMapping("/list-all")
    public List<ChamadoResponseDTO> listarChamados () {
    	return callService.listarTodosChamados()
    		.stream()
    		.map(entity -> {
    			ChamadoResponseDTO dto =  new ChamadoResponseDTO();
    			dto.setId(entity.getId());
                dto.setTitulo(entity.getTitulo());
                dto.setDescricao(entity.getDescricao());
                dto.setCategoria(entity.getCategoria());
                dto.setCallingPriority(entity.getCallingPriority());
                dto.setDataCriacao(entity.getDataCriacao());
                dto.setUsuarioId(entity.getId());
                dto.setNomeUsuario(entity.getUsuario().getName());
                	return dto;
    		}).toList();
    }
    
    @GetMapping("/detail-call/{id}")
    public Optional<CallEntity> detalharChamado (@PathVariable Long id) {
    	return callService.detalharChamado(id);
    }
   
}
