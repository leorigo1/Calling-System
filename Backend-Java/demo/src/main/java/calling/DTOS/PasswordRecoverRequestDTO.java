package calling.DTOS;

public class PasswordRecoverRequestDTO {
	private String assunto;
	private String destino;
	private String texto;
	
	public PasswordRecoverRequestDTO () {}
	
	public PasswordRecoverRequestDTO(String assunto, String destino, String texto) {
		this.assunto = assunto;
		this.destino = destino;
		this.texto = texto;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
