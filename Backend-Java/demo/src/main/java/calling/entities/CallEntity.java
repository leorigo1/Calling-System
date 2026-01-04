package calling.entities;

import java.time.Instant;

import calling.enums.CallingPriority;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Callings")
public class CallEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String descricao;
	private String categoria;
	
	@Enumerated(EnumType.ORDINAL)
	private CallingPriority callingPriority;
	
	private Instant dataCriacao;
	
    @ManyToOne
    @JoinColumn(name = "user_id")
	private UserEntity usuario;
	
	
	public CallEntity () {}
	
	public CallEntity(Long id, String titulo, String descricao, String categoria, CallingPriority callingPriority, Instant dataCriacao, UserEntity usuario) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.callingPriority = callingPriority;
		this.dataCriacao = dataCriacao;
		this.usuario = usuario;
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

	public UserEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntity usuario) {
		this.usuario = usuario;
	}
}
