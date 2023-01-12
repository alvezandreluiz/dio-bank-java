package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente andre = new Cliente();
		andre.setNome("André");
		
		Conta cc = new ContaCorrente(andre);
		Conta poupanca = new ContaPoupanca(andre);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
