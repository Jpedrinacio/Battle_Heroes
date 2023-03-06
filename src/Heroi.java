public class Heroi extends Personagem{
    int ataque;

    static int defesa;



    Heroi(int atk, int def){
        this.ataque = atk;
        this.defesa = def;

    }
    /* Overload de uma constructor */
    Heroi(int atk, int def, int Sup){
        this.ataque = atk;
        this.defesa = def;
        this.Super = Sup;
    }

    @Override
    public void Fala(){
        System.out.println("O bem sempre vence!");

    }

    public void atacar(Vilao alvo) {
        System.out.println(nome + " utilizou " + habilidade);
        System.out.println(nome + " atacou com " + ataque);
        int dano = ataque - Vilao.defesa;
        alvo.setVida(alvo.getVida() - dano);
        System.out.println(alvo.nome + " está com " + alvo.getVida() + " de vida agora");
    }


}
