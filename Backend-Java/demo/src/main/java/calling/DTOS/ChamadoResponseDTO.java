package calling.DTOS;

import java.time.Instant;

import calling.enums.CallingPriority;

public class ChamadoResponseDTO {

	 private Long id;
	    private String titulo;
	    private String descricao;
	    private String categoria;
	    private CallingPriority callingPriority;
	    private Instant dataCriacao;

	    private Long usuarioId;
	    private String nomeUsuario;
	    
	    public ChamadoResponseDTO () {}
	    
		public ChamadoResponseDTO(Long id, String titulo, String descricao, String categoria,
				CallingPriority callingPriority, Instant dataCriacao, Long usuarioId, String nomeUsuario) {
			this.id = id;
			this.titulo = titulo;
			this.descricao = descricao;
			this.categoria = categoria;
			this.callingPriority = callingPriority;
			this.dataCriacao = dataCriacao;
			this.usuarioId = usuarioId;
			this.nomeUsuario = nomeUsuario;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public Instant getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(Instant dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public Long getUsuarioId() {
			return usuarioId;
		}

		public void setUsuarioId(Long usuarioId) {
			this.usuarioId = usuarioId;
		}

		public String getNomeUsuario() {
			return nomeUsuario;
		}

		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}       
}
