package CerneSukno;

abstract class Zvire implements IPlocha {
    protected double vaha;

    @Override
    public void sdelPlochu() {
        double plocha;
        if(this instanceof Pes){
            plocha=2*vaha+((Pes) this).cena*0.1;
        }else{
            plocha=2*vaha;
        }
        System.out.println("Zvíře plocha: "+ plocha);
    }
}