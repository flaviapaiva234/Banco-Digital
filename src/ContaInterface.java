
public interface ContaInterface {
	// não precisa colocar o publub pq todo metodo que está na interface já é publico, seria uma redundancia)
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, ContaInterface contaDestino);
	void imprimirExtrato();

}
