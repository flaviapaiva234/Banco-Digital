
public interface ContaInterface {
	// n�o precisa colocar o publub pq todo metodo que est� na interface j� � publico, seria uma redundancia)
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, ContaInterface contaDestino);
	void imprimirExtrato();

}
