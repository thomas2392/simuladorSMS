package operadora.com.br;

public class Linha {
    
    public String telefone;
    public int saldo;
    public boolean status;

    public Linha(String telefone, int saldo) {
        this.telefone = telefone;
        this.saldo = saldo;
        this.status = true;//true representa que o telefone está conectado.
    }
    
}
