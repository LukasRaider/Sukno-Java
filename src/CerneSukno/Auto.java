package CerneSukno;

public class Auto implements IPlocha {
    protected double vaha;
    public Auto(double vaha){
        this.vaha=vaha;
    }

    @Override
    public void sdelPlochu() {
        System.out.println("Auto plocha: "+vaha*4);
    }
}
