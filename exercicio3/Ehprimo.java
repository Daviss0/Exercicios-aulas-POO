package exercicio3;

public class Ehprimo {
    private int numero;
    
    public Ehprimo (int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero (int numero) {
        this.numero = numero;
    }

    public boolean primoOuNao(int numero) {
        boolean ehFalso = false;
         int resto = numero % 2;
         if (resto == 0) {
        return ehFalso = false;
      }
      else if (resto == 1) {
        return ehFalso = true;
         
      }
      return ehFalso;
    }
}
