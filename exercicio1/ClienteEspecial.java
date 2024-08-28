package exercicio1;

public class ClienteEspecial {

    private double valor;

    public ClienteEspecial (double valor) {
        this.valor = valor;
    }
    
    public double getValor () {
        return this.valor;
    }
    public void setValor (double valor) {
        this.valor = valor;
    } 
    
    public double sacar (double saque) {
        if (this.valor > 0) {
           double taxa = saque * 0.001;
           double totalSaque = saque + taxa;
           this.valor -= totalSaque;
            System.out.println("Saque: "+ saque + "ficou com taxa de: "+ taxa);
        }
        else {
            System.out.println("Não tem saldo na conta!");
        }
        return saque;
    }
}
