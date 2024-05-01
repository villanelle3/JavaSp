public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada agora? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume agora? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume agora? " + smartTv.volume);
        smartTv.aumentarVolumeParametro(2);
        System.out.println("Volume agora? " + smartTv.volume);
    }
}

// javac Usuario.java
// java Usuario
// del Usuario.class
