package bank;

public class Account {

    //Constante(valor que não pode ser alterado) que limita os caracteres a 12
    private static final int MAX_LENGTH = 12;

    //Agencia
    private String ag;
    //Conta(Account)
    private String cc;
    //Usuário
    private String name;

    private double balance;

    private Log logger;

    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    //Quando chefa no limete de caracteres não deixa escrever mais (corta a string)
    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }else {
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("Depósito de R$ " + value + "---> Saldo da sua conta agora é de R$" + balance);
    }


    //Para Sacar
    public boolean withDraw(double value){
        boolean result = true;
        if(balance < value){
            logger.out("Seus saldo atual é de: " + balance);
            return false;
        }else{
            balance -= value;
            logger.out("Saque de R$" + value + "---> Saldo da sua conta agora é de R$" + balance);
            return true;

        }
    }

    @Override
    public String toString() {
        String result = "A conta " + this.name  + " " + this.ag + " / " + this.cc + "possui: R$ " + balance;
        return result;
    }
}
