package exercicio2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int volume = 10;
        int canais = 0;
        Controle c = new Controle(volume, canais);
        int opcao = 0;
        do {
        System.out.println("controle remoto");
        System.out.println("1. volume");
        System.out.println("2. canais");
        System.out.println("3. trocar para canal indicado");
        System.out.println("4. consultar volume e canal");
        System.out.println("5. desligar");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("aumentar ou abaixar volume?");
                String aumentarOuAbaixar = scan.next();
                c.setVolume(aumentarOuAbaixar);
                if (aumentarOuAbaixar.equals("aumentar")) {
                    volume += 10;
                }
                else if (aumentarOuAbaixar.equals("abaixar")) {
                    volume -= 5;
                }
                break;

             case 2:
                 System.out.println("proximo canal ou anterior?");
                 String mudarCanal = scan.next();
                 c.setCanais(mudarCanal);
                 if (mudarCanal.equals("proximo")) 
                    canais++;
                 else if (mudarCanal.equals("anterior"))
                 canais--;
                break;

                case 3:
                 System.out.println("quer mudar para qual canal?");
                 int canalIndicado = scan.nextInt();  
                 c.trocarCanalIndicado(canalIndicado);
                break;

                case 4: 
                System.out.println("volume: "+ volume + "/ canal: "+ canais);
            default:
                break;
        }
    } while (opcao != 0);
    scan.close();
    }
}
