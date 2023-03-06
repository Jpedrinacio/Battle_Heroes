
import javax.swing.plaf.synth.SynthStyleFactory;
import java.awt.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args)
    {
        Heroi hero1 = new Heroi(80,40, 30);
        hero1.nome = "Baby_Shark";
        hero1.habilidade = "Queixo_Esmagador";



        Vilao vilain1 = new Vilao(70, 55);
        vilain1.nome = "Troca_amigo_por_mulher";
        vilain1.habilidade = "Vacilagem";



        Suporte sup1 = new Suporte(10);
        sup1.nome = "Baianor_Lokinho";
        sup1.habilidade = "Cura_Gordinha";

        Batle batalha1 = new Batle();
        ;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de Turnos: ");
        int turno = entrada.nextInt();
        batalha1.turnos = turno;

        System.out.println("------------------------------------------");
        System.out.println("O Herói é "+ hero1.nome);
        System.out.println("O Vilão é "+ vilain1.nome);
        System.out.println("O Suporte é "+ sup1.nome);
        System.out.println("------------------------------------------");


        for (int i = 0; i < turno; i++){
            System.out.println("------------------------------------------");
            System.out.println("Quem vai Agir?\n Digite H  para o Herói\n Digite V  para o Vilão\n Digite S  para o Suporte ");
            System.out.println("------------------------------------------");
            String Atacante = entrada.next();

            if(Atacante.equals("H")) {
                hero1.atacar(vilain1);
            }
            else if (Atacante.equals("V")) {
                vilain1.atacar(hero1);
            }
            else if (Atacante.equals("S")) {
                System.out.println("Suporte vai Curar quem :\n H para Herói\n V para Vilão");
                String Cura = entrada.next();
                System.out.println("------------------------------------------\n" +
                        "Baianor_Lokinho usou Cura_Gordinha\n" +
                        "------------------------------------------");
                if (Cura.equals("H")){
                    System.out.println("Vida do herói antes da cura "+ hero1.getVida() );
                    System.out.println("Suporte curou 10 de vida do herói");
                    hero1.setVida(hero1.getVida() + sup1.cura);
                    System.out.println("Vida do herói após a cura "+ hero1.getVida() );
                }
                else if (Cura.equals("V")) {
                    System.out.println("Vida do vilão antes da cura "+ vilain1.getVida() );
                    System.out.println("Suporte curou 10 de vida do vilão");
                    System.out.println("------------------------------------------");
                    vilain1.setVida(vilain1.getVida() + sup1.cura);
                    System.out.println("Vida do vilão após a cura "+ vilain1.getVida() );
                }
                else{
                    System.out.println(" Você digitou algo incorreto, cura do Suporte cancelada");
                }

            }
            if (!Atacante.equals("H") && !Atacante.equals("V") && !Atacante.equals("S")) {
                System.out.println("Digite uma entrada correta!");
                i--;
            }


        }
        System.out.println("------------------------------------------");
        System.out.println("Acabaram os turnos!");
        System.out.println("------------------------------------------");


        if (hero1.getVida() > vilain1.getVida()){
            batalha1.nomeVencedor = hero1.nome;
            System.out.println(batalha1.Vencedor() + " venceu pois tem mais vida que o vilão!");
            hero1.Fala();
        } else if (hero1.getVida() < vilain1.getVida()) {
            batalha1.nomeVencedor = vilain1.nome;
            System.out.println(batalha1.Vencedor() + " venceu pois tem mais vida que o herói!");
            vilain1.Fala();
        }
        else {
            System.out.println("Empate !");
        }
        System.out.println("------------------------------------------");
    }

}