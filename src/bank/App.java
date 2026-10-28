//Criar uma conta (agencia, conta, nome)
//  limitar o nome - 12 caracteres
//  sacar valores
//      nao pode sacar mais do que tem
//  depositar

//  informar para o usuario as operação (saque, deposito)

package bank;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Depositar, Saque, Sair
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("0001", "1234 ", "Vitor");

        //Se o usuário digitar:
        // D = Depositar
        // S = Sacar
        // E = Sair (exit)
        while (true) {
            System.out.println("Selecione oque deseja fazer:\n\nD = Depositar\nS = Sacar\nE = Sair");
            String op = scanner.nextLine();

            if (op.equals("D")) {
                System.out.println("Informe o valor deseja depositar: ");
                double value = scanner.nextDouble();
                account.deposit(value);

            } else if (op.equals("S")) {
                System.out.println("Informe o valor deseja sacar: ");
                double value = scanner.nextDouble();
                if (!account.withDraw(value)) {
                    System.out.println("Não foi possível sacar o valor R$ " + value);
                }

            } else if (op.equals("E")) {
                break;
            } else{
                System.out.println("Comando inválido");
            }
            //Evita usar o mesmo Scanner em todos os loops
            scanner = new Scanner(System.in);
        }
    }
}