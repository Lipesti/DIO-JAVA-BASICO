public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando Volume para : " + volume);
        // Aumentar Volume +1

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo Volume para : " + volume);
        // Diminuir Volume -1
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }
}