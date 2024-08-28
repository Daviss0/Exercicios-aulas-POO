package exercicio1;


public class ContaCorrente {
    private double valor;
    
    public ContaCorrente (double valor) {
        this.valor = valor;
    }

    public double obterSaldo() {
        return this.valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public double depositar (double deposito) {
        this.valor += deposito;
        return deposito;
    }

    public double sacar (double saque) {
        if (this.valor > 0) {
            double taxa = saque * 0.005;
            double totalSaque = saque + taxa;
            this.valor -= totalSaque;
            System.out.println("Saque: "+ saque+ " realizado com sucesso, taxa de operação: "+taxa);
        }
        else {
            System.out.println("sem saldo na conta!");
        }
        return saque ;
    }
} 
    

