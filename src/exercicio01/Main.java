package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        double valor = 0;
        char rpp='2';

        System.out.print("Nome do correntista --> ");
        conta.correntista = sc.next();
        conta.saldo = rd.nextDouble(1000,10000);
        do {
            System.out.printf("%nSaldo:R$%.2f%nDigite 1 para depósito, Digite 2 para saque ou 0 para Sair:",conta.saldo);
            rpp=sc.next().charAt(0);
            if (rpp=='1'){
                System.out.print("Digite um valor para depositar:");
            valor = sc.nextDouble();
            conta.depositar(valor);
            } else if (rpp=='2') {
                System.out.print("Digite um valor para sacar:");
                valor = sc.nextDouble();
                conta.sacar(valor);
            }
        }while (rpp!='0');
        System.out.printf("%n%d seu saldo final é de %.2f",conta.correntista,conta.saldo);
    }
}