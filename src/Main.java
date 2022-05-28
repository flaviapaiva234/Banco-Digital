
public class Main {

	public static void main(String[] args) {
		Cliente flavia = new Cliente();
		flavia.setNome ("Flávia");
		
		Cliente paiva = new Cliente();
		paiva.setNome("Paiva");
		
		Conta cc = new ContaCorrente (flavia);
		Conta poupanca = new ContaPoupanca (flavia);
		
		cc.depositar(1500);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
