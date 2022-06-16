package jogoVelha;

public class Campo {

	private boolean estaVazio;
	private String simbolo;

	// É chamado quando o objeto é construido;

	public Campo() {
		this.reset();

	}

	public boolean getEstaVazio() {
		return this.estaVazio;
	}

	public String getSimbolo() {
		return this.simbolo;
	}

	public boolean setSimbolo(String simbolo) {
		if (this.estaVazio) {
			if (simbolo.equals("x") || simbolo.equals("o")) {
				this.simbolo = simbolo;
				this.estaVazio = false;
				return true;
				// deu certo;
			}

		}
		return false;

	}

	public void reset() {
		this.simbolo = " ";
		this.estaVazio = true;

	}

	public String toString() {

		if (this.estaVazio)
			return "-";
		else
			return this.simbolo;

	}

	public boolean simboloIgual(Campo c) {
		if (this.simbolo.equals(c.getSimbolo()) && this.estaVazio == false) {
			return true;

		} else {
			return false;
		}
	}

}
