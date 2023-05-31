package application;

public class ContaBancaria {
	private String Cliente;
	private int num_conta;
	private float saldo;

	public ContaBancaria(String cliente, int num_conta, float saldo) {
		Cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float saque) {
		if (saque > saldo) {
			System.out.println("O saldo não pode ser negativo.");
		} else {
			this.saldo = saldo - saque;
		}
	}

	public void depositar(float deposito) {
		this.saldo = saldo + deposito;
	}

}
