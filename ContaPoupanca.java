package application;

public class ContaPoupanca extends ContaBancaria{
	
	int dia_rendimento;
	
	
	public int getDia_rendimento() {
		return dia_rendimento;
	}

	public void setDia_rendimento(int dia_rendimento) {
		this.dia_rendimento = dia_rendimento;
	}

	public ContaPoupanca (String cliente, int num_conta, float saldo){
		super(cliente, num_conta, saldo);
	}
	
	public void calcularNovoSaldo (int taxa) {
		super.setSaldo(super.getSaldo() * (taxa/100));
	}
}
