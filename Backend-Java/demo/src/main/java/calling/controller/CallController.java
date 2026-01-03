package calling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.DTOS.ChamadoCreateDTO;
import calling.entities.CallEntity;
import calling.services.CallService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(name = "/call")
public class CallController {

    private final CallService callService;
    
    public CallController(CallService callService) {
        this.callService = callService;
    }
	
	@PostMapping("/create-call")
	public ResponseEntity<CallEntity> criarChamado (@RequestBody ChamadoCreateDTO dto) {

        CallEntity chamado = callService.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(chamado);
	}
	
}
