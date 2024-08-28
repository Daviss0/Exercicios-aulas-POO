package exercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("qual valor começa na conta?");
        double valor = scan.nextDouble();
        ContaCorrente cc = new ContaCorrente(valor);
        int opcao = 0;

        do {
        System.out.println("menu de opções: ");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Obter Saldo");
        System.out.println("0. Sair");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
              System.out.println("quanto deseja depositar?");
              double deposito = scan.nextDouble();
              cc.depositar(deposito);
            break;

            case 2:
            System.out.println("1. cliente comum / 2. Cliente especial");
            int opcao2 = scan.nextInt();
            if (opcao2 == 1){
            System.out.println("quanto deseja sacar?");
            double saque = scan.nextDouble();
              cc.sacar(saque);
            break;
            }
            else if (opcao2 == 2) {
               System.out.println("quanto deseja sacar?");
               double saque = scan.nextDouble();
               ClienteEspecial ce = new ClienteEspecial(saque);
               ce.sacar(saque);
               break;
            }
            else {
              System.out.println("opcao invalida");
              break;
            }

            case 3:
              System.out.println(cc.obterSaldo());
            break;
            default: 
               System.out.println("opção invalida!");
            break;
        }
        } while (opcao != 0);
        scan.close();
    }
}