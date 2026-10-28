package bank;

public class App {
    public static void main(String[] args) {

        Account account = new Account("0001", "1234", "Vitor");

        boolean succeed = account.withDraw(200.0);
        if (!succeed) {
            System.out.println("Você não tem saldo suliciente para sacar");
        }

        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)) {
            System.out.println("Você não tem saldo sulficiente para sacar");
        }

        if (!account.withDraw(200)) {
            System.out.println("Você não tem saldo sulficiente para sacar");
        }

        System.out.println(account);


        //Criar uma conta (agencia, conta, nome)
        //  limitar o nome - 12 caracteres
        //  sacar valores
        //      nao pode sacar mais do que tem
        //  depositar

        //  informar para o usuario as operação (saque, deposito)
    }
}