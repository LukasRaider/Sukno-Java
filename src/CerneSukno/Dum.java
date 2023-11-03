package CerneSukno;

public class Dum implements IPlocha {
    protected int pocetOken;
    protected double pudorys;

    public Dum(int pocetOken, int pudorys){
        this.pocetOken=pocetOken;
        this.pudorys=pudorys;
    }

    @Override
    public void sdelPlochu() {
        System.out.println("Dum plocha: "+pudorys);
    }
}
