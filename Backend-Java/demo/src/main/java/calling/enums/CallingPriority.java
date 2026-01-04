package calling.enums;

public enum CallingPriority {

    BAIXA(0),
    MEDIA(1),
    ALTA(2);

	 private final int codigo;

	 CallingPriority(int codigo) {
	        this.codigo = codigo;
	    }

	    public int getCodigo() {
	        return codigo;
	    }
}
