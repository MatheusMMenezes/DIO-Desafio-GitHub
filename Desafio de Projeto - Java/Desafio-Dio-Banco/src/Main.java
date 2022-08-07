
public class Main {
	
	public static void main(String[] args) {
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);		
		Conta cp = new ContaPoupança(venilton);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
