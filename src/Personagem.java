public abstract class Personagem  {
    String nome;
    String habilidade;

    int Super;


    private int vida = 300;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void Fala(){
        System.out.println("Que seja uma boa batalha!");
    }





}
