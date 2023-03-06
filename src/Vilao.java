public class Vilao extends Personagem{
    int ataque;

    static int defesa;

    String alvo;

   Vilao(int atk, int def){
       this.ataque = atk;
       this.defesa = def;
   }


   @Override
   public void Fala(){
       System.out.println("O mal venceu!");
   }

    public void atacar(Heroi alvo) {
        System.out.println(nome + " utilizou " + habilidade);
        System.out.println(nome + " atacou com " + ataque);
        int dano = ataque - Heroi.defesa;
        alvo.setVida(alvo.getVida() - dano);
        System.out.println(alvo.nome + " está com " + alvo.getVida() + " de vida agora");
    }
}
