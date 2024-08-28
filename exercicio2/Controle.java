package exercicio2;

public class Controle {
    
    private int volume;
    private int canais = 0;

    public Controle (int volume, int canais) {
        this.volume = volume;
        this.canais = canais;
    }

    public int getVolume () {
        return this.volume;
    }
    public int setVolume (String volume) {
        if (this.volume > 0 && this.volume <= 100){
        if (volume.equals("aumentar")) {
            for (int i = 0; i<volume.length() + 2; i++) {
                this.volume++;
            }
            System.out.println("volume: "+ this.volume);
        }
        else if (volume.equals("abaixar")) {
           for (int i = 0; i<volume.length() - 2; i++) {
                this.volume--;
            }
            System.out.println("volume: "+this.volume);
        }
        else {
            System.out.println("valor invalido");
        }
    }
    else if (this.volume < 0){
        System.out.println("mudo");
    }
    else {
        System.out.println("volume maximo");
    }
        return this.volume;
    }

    public int getCanais() {
        return this.canais;
    }
    public int setCanais(String canais) {

        if (canais.equals("proximo")) {
          this.canais++;
          System.out.println("canal: "+ this.canais);
        }
        else if (canais.equals("anterior")) {
            this.canais--;
            System.out.println("canal: "+ this.canais);
        }
        else {
            System.out.println("entrada invalida");
        }
    
    return this.canais;
    }

    public int trocarCanalIndicado(int canal) {
        if (canal > 0 && canal <50){
        System.out.println("canal "+ canal);
        }
        else {
            System.out.println("canal nao encontrado");
        }
        return canal;
    }

}
