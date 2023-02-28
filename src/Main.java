
import javax.swing.plaf.synth.SynthStyleFactory;
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Heroi hero1 = new Heroi(80,45, 30,300);
        hero1.nome = "Baby_Shark";
        hero1.habilidade = "Queixo_Esmagador";


        Vilao vilain1 = new Vilao(75, 70,300);
        vilain1.nome = "Troca_amigo_por_mulher";
        vilain1.habilidade = "Vacilagem";


        Suporte sup1 = new Suporte(60);
        sup1.nome = "Baianor_Lokinho";
        sup1.habilidade = "Cura_Gordinha";


        Scanner entrada = new Scanner(System.in);
        Batle batalha1 = new Batle("Baby_Shark", "Troca_amigo_por_mulher","Baianor_Lokinho");
        System.out.println("Digite a quantidade de Turnos: ");
        int turno = entrada.nextInt();
        batalha1.turnos = turno;


        for (int i = 0; i <= turno; i++){
            System.out.println("Quem vai Atacar?");
            String Atacante = entrada.nextLine();
            if(Atacante.equals("Herói")) {
                System.out.println("------------------------------------------\n" +
                        "  Baby_shark utilizou Queixo_Esmagador" +"\n" +
                        "------------------------------------------");
                System.out.println(hero1.nome + " atacou com 80");
                int dano = hero1.ataque - vilain1.defesa ;
                vilain1.vida = vilain1.vida - dano;
                System.out.println(vilain1.nome + " está com "+ vilain1.vida + " de vida agora" );
            }
            else if (Atacante.equals("Vilão")) {
                System.out.println("Vilão atacou com 75");
                int dano = hero1.defesa - vilain1.ataque;
                hero1.vida = hero1.vida - dano;
                System.out.println("Vida do herói após ataque "+ hero1.vida );
            }
            else if (Atacante.equals("Suporte")) {
                System.out.println("Suporte vai Curar quem : ");
                String Cura = entrada.nextLine();
                if (Cura.equals("Herói")){
                    System.out.println("Vida do herói antes da cura "+ hero1.vida );
                    System.out.println("Suporte curou 60 de vida do herói");
                    hero1.vida = hero1.vida + sup1.cura;
                    System.out.println("Vida do herói após a cura "+ hero1.vida );
                }
                else {
                    System.out.println("Vida do vilão antes da cura "+ vilain1.vida );
                    System.out.println("Suporte curou 60 de vida do vilão");
                    vilain1.vida = vilain1.vida + sup1.cura;
                    System.out.println("Vida do vilão após a cura "+ vilain1.vida );
                }

            }

        }

        if (hero1.vida > vilain1.vida){
            System.out.println("Herói venceu!");
        } else if (hero1.vida < vilain1.vida) {
            System.out.println("Vilão venceu!");
        }
        else {
            System.out.println("Empate!");
        }
    }

}