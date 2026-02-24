package exercicio01;

public class conta {
    // atributos ou variáveis de instância
    String correntista;
    int numero;
    double saldo;

    //método para depositar um valor na conta
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //método para sacar um valor da conta
    public void sacar(double valor){
        saldo = saldo - valor;
    }
}
