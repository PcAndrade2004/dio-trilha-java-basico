public class Main {
    public static void main(String[] args) {

        smartTV tv = new smartTV();

        System.out.println("Tv Ligada? " + tv.ligada);
        System.out.println("Canal Atual: " + tv.canal);
        System.out.println("Volume Atual: " + tv.volume);

        System.out.println("\nUtilizando os métodos");

        //Ligando TV
        tv.ligar();
        System.out.println("Novo status Tv: " + tv.ligada);

        //Desligando TV
        tv.desligar();
        System.out.println("Novo status da TV: " + tv.ligada);

        //Aumentando volume da TV
        tv.aumentarVolume();
        System.out.println("Aumentando volume da TV: " + tv.volume);

        //diminuindo volume TV
        tv.diminuirVolume();
        System.out.println("Diminuindo volume da TV: " + tv.volume);

        //aumentando canal
        tv.aumentarCanal();
        System.out.println("Aumentando canal da TV: " + tv.canal);

        //diminuindo canal da tv
        tv.diminuirCanal();
        System.out.println("Diminuindo volume da TV: " + tv.canal);

        //escolhendo canal expecifico
        tv.mudarCanal(30);
        System.out.println("Escolhendo o canal de TV: " + tv.canal);






    }
}