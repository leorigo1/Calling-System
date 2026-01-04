package calling.DTOS;

import calling.enums.CallingPriority;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ChamadoCreateDTO {

    private String titulo;
    private String descricao;
    private String categoria;
    private CallingPriority callingPriority;
    private Long usuarioId;

    public ChamadoCreateDTO() {}

    public ChamadoCreateDTO(String titulo, String descricao, String categoria,
                            CallingPriority callingPriority, Long usuarioId) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.callingPriority = callingPriority;
        this.usuarioId = usuarioId;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public CallingPriority getCallingPriority() {
		return callingPriority;
	}

	public void setCallingPriority(CallingPriority callingPriority) {
		this.callingPriority = callingPriority;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
}

