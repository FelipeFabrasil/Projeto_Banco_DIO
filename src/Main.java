
public class Main {

	public static void main(String[] args) {
		Cliente Felipe = new Cliente();
		Felipe.setNome("Felipe");
		
		Conta cc = new ContaCorrente(Felipe);
		Conta poupanca = new ContaPoupanca(Felipe);

		cc.depositar(10000);
		cc.transferir(300, cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
