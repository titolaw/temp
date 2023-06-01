package corrida;

public class CarroCorrida {
	private int numeroCarro;
	private String piloto;
	private String equipe;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean ligado;

	public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
		this.numeroCarro = numeroCarro;
		this.piloto = piloto;
		this.equipe = equipe;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumeroCarro() {
		return numeroCarro;
	}

	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void acelerar(float acelera) {
		if (isLigado() == true) {
			if ((getVelocidadeAtual() + acelera) > getVelocidadeMaxima()) {
				System.out.println("Não é possível exceder a velocidade máxima.");
			} else {
				setVelocidadeAtual(getVelocidadeAtual() + acelera);
			}
		} else {
			System.out.println("O carro está desligado.");
		}
	}

	public void frear(float pct) {
		if (isLigado() == true) {
			setVelocidadeAtual(getVelocidadeAtual() - (getVelocidadeAtual() / pct));
		} else {
			System.out.println("O carro está desligado.");
		}
	}

	public void parar() {
		setVelocidadeAtual(0);
	}

	public void ligar() {
		setLigado(true);
	}

	public void desligar() {
		if (getVelocidadeAtual() == 0) {
			setLigado(false);
		} else {
			System.out.println("É necessário parar o carro antes de desligar.");
		}
	}

	@Override
	public String toString() {
		return "CarroCorrida [numeroCarro= " + numeroCarro + ", piloto= " + piloto + ", equipe= " + equipe
				+ ", velocidadeMaxima= " + velocidadeMaxima + ", velocidadeAtual= " + velocidadeAtual + ", ligado= "
				+ ligado + "]";
	}

}
