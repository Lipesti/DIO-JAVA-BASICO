public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("\n================================");

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.trocarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("\n================================");


       


        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
        System.out.println("\n================================");


       // smartTv.desligar();
        //System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
