
public class Main {

	public static void main(String[] args) {
		
		Cliente edu = new Cliente();
		edu.setNome("Eduardo");
		
		Conta cc = new ContaCorrente(edu);
		Conta cp = new ContaPoupanca(edu);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
