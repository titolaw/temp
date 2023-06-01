package corrida;

public class MainCorrida {

	public static void main(String[] args) {
		CarroCorrida c = new CarroCorrida(001, "ayrton", "ferrari", 300);
		
		c.ligar();
		c.acelerar(200);
		System.out.println(c.getVelocidadeAtual());
		
		c.desligar();
		
		c.frear(10);
		
		System.out.println(c.getVelocidadeAtual());
		
		System.out.println(c.toString());

	}

}
