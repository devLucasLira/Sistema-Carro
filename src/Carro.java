public class Carro {

    private boolean ligado = false;

    private int marcha = 0;

    private int velocidade = 0;

    public void ligar() {
        ligado = true;
        System.out.println("O carro esta ligado!");
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro esta desligado!");

        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (ligado && novaMarcha >= 0 && novaMarcha <= 6 )
            if (novaMarcha == marcha +1 || novaMarcha == marcha-1){
            marcha = novaMarcha;
            System.out.println("A troca de marchas e possível!");

        }

    }

    public void acelerar() {

        // ou if (ligado) return; // faria a mesma coisa do que tem a baixo... com o if (ligado) {"codigo"}

        if (ligado) {

            if (marcha == 1 && velocidade < 20) {
                velocidade++;

            }
            if (marcha == 2 && velocidade < 40) {
                velocidade++;

            }
            if (marcha == 3 && velocidade < 60) {
                velocidade++;

            }
            if (marcha == 4 && velocidade < 80) {
                velocidade++;

            }
            if (marcha == 5 && velocidade < 100) {
                velocidade++;

            }
            if (marcha == 6 && velocidade < 120) {
                velocidade++;
            }

            System.out.println("O carro esta andando e passando as marchas!");
        }
    }

    public void desacelerar() {
        if (ligado && velocidade > 0) {
            velocidade--;
            System.out.println("O carro esta desacelerando!");
        }
    }

    public void virar(String direcao){
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            if (direcao.equalsIgnoreCase("esquerda") || direcao.equalsIgnoreCase("direita")) {
                System.out.println("O carro virou para a " + direcao + "!" );
            }else {
                System.out.println("Direção invalida, o carro so vira para esquerda ou direita.");
            }
        } else { System.out.println("Não é possível virar, verifique se o carro está ligado, e abaixo de 40km/h");

        }

    }
    public int verificarVelocidade(){
        return velocidade;
    }
}