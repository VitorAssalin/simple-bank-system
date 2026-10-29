//Criar uma conta (agencia, conta, nome)
//  limitar o nome - 12 caracteres
//  sacar valores
//      nao pode sacar mais do que tem
//  depositar

//  informar para o usuario as operação (saque, deposito)

package bank;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Depositar, Saque, Sair
        Scanner scanner = new Scanner(System.in);

        //C = Criar conta
        //E = Sair (exit)
        Bank santander = new Bank("0001");
        while (true) {
            System.out.println("O que deseja fazer:\n\nC = Criar conta\nE = Sair");
            String op = scanner.nextLine();

            if (op.equals("C")) {
                System.out.println("Digite o seu nome:");
                String name = scanner.nextLine();
                System.out.println(name);
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);
                operateAccount(account);
            } else if (op.equals("E")) {
                break;

            } else {
                System.out.println("Comando inválido");
            }
        }
        List<Account> accountList =santander.getAccounts();
        //Nomenclatura padrão para fazer loops em objetos
        for(Account cc : accountList){
            System.out.println(cc);
        }
        santander.outputTotal();
    }

    static void operateAccount(Account account) {
        Scanner scanner = new Scanner(System.in);
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
            } else {
                System.out.println("Comando inválido");
            }
            //Evita usar o mesmo Scanner em todos os loops
            scanner = new Scanner(System.in);
        }
    }
}