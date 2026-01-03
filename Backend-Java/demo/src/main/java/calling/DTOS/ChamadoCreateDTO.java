package calling.DTOS;

public class ChamadoCreateDTO {

    private String titulo;
    private String descricao;
    private String categoria;
    private Integer prioridade;
    private Long usuarioId;
    
    public ChamadoCreateDTO () {}
    
	public ChamadoCreateDTO(String titulo, String descricao, String categoria, Integer prioridade, Long usuarioId) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.prioridade = prioridade;
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

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
}
