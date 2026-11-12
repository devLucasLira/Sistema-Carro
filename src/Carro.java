public class Carro {

    private boolean ligado = false;

    private int marcha = 0;

    private int velocidade = 0;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro esta desligado!");

        }
    }
    public void trocarMarcha(int novaMarcha) {
        if (ligado && novaMarcha >= 0 && novaMarcha <= 6 )
            if (novaMarcha == marcha +1 || novaMarcha == marcha-1){
            marcha = novaMarcha;

        }

    }

    public void acelerar(){

    }
}