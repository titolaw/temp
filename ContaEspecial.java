package application;

public class ContaEspecial extends ContaBancaria {

	private float limite;

	public ContaEspecial(String cliente, int num_conta, float saldo) {
		super(cliente, num_conta, saldo);
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void sacar(int saque) {
		if ((super.getSaldo() - saque) > (limite * (-1))) {
			super.setSaldo(super.getSaldo() - saque);
		} else {
			System.out.println("O saque excede o limite estabelecido.");
		}
	}

}
