
public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		
		double rendimento = 0.06;
		double rendimentoTotal = saldo * rendimento;
		saldo += rendimentoTotal;
		System.out.println("Sua conta rendeu: R$" + rendimentoTotal + " esse mês!");
		System.out.println("Seu saldo total é: R$" + saldo + " esse mês!");
		
	}


}
