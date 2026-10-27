package bank;

public class Account {

    //Agencia
    private String ag;
    //Conta(Account)
    private String cc;
    //Usuário
    private String name;

    //Limita os caracteres a 12
    private static final int MAX_LENGTH = 12;

    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
    }

    //Quando chefa no limete de caracteres não deixa escrever mais (corta a string)
    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }else {
            this.name = name;
        }
    }
}
