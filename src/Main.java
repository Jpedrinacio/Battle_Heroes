
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

        System.out.println("------------------------------------------");
        System.out.println("O Herói é "+ hero1.nome);
        System.out.println("O Vilão é "+ vilain1.nome);
        System.out.println("O Suporte é "+ sup1.nome);
        System.out.println("------------------------------------------");

        System.out.println("Quem vai Agir?\n Digite H  para o Herói\n Digite V  para o Vilão\n Digite S  para o Suporte ");
        for (int i = 0; i <= turno; i++){

            String Atacante = entrada.nextLine();
            if(Atacante.equals("H")) {
                System.out.println("------------------------------------------\n" +
                        "  Baby_shark utilizou Queixo_Esmagador" +"\n" +
                        "------------------------------------------");
                System.out.println(hero1.nome + " atacou com 80");
                System.out.println("------------------------------------------");
                int dano = hero1.ataque - vilain1.defesa ;
                vilain1.vida = vilain1.vida - dano;
                System.out.println(vilain1.nome + " está com "+ vilain1.vida + " de vida agora" );
            }
            else if (Atacante.equals("V")) {
                System.out.println("---------------------------------------------\n" +
                        "Troca_amigos_por_Mulher atacou com Vacialgem\n" +
                        "---------------------------------------------");
                System.out.println(vilain1.nome + " atacou com 75");
                System.out.println("------------------------------------------");
                int dano =   vilain1.ataque - hero1.defesa;
                hero1.vida = hero1.vida - dano;
                System.out.println(hero1.nome + " está com "+ hero1.vida + " de vida agora");
            }
            else if (Atacante.equals("S")) {
                System.out.println("Suporte vai Curar quem : ");
                String Cura = entrada.nextLine();
                System.out.println("------------------------------------------\n" +
                        "Baianor_Lokinho usou Cura_Gordinha\n" +
                        "------------------------------------------");
                if (Cura.equals("Herói")){
                    System.out.println("Vida do herói antes da cura "+ hero1.vida );
                    System.out.println("Suporte curou 60 de vida do herói");
                    System.out.println("------------------------------------------");
                    hero1.vida = hero1.vida + sup1.cura;
                    System.out.println("Vida do herói após a cura "+ hero1.vida );
                }
                else {
                    System.out.println("Vida do vilão antes da cura "+ vilain1.vida );
                    System.out.println("Suporte curou 60 de vida do vilão");
                    System.out.println("------------------------------------------");
                    vilain1.vida = vilain1.vida + sup1.cura;
                    System.out.println("Vida do vilão após a cura "+ vilain1.vida );
                }

            }
            System.out.println("Quem vai Agir?\n Digite H  para o Herói\n Digite V  para o Vilão\n Digite S  para o Suporte ");

        }
        System.out.println("------------------------------------------");
        System.out.println("Acabaram os turnos!");
        System.out.println("------------------------------------------");

        if (hero1.vida > vilain1.vida){
            System.out.println(hero1.nome + " venceu pois tem mais vida que o vilão!");
        } else if (hero1.vida < vilain1.vida) {
            System.out.println(vilain1.nome + " venceu pois tem mais vida que o herói!");
        }
        else {
            System.out.println("Empate !");
        }
        System.out.println("------------------------------------------");
    }

}