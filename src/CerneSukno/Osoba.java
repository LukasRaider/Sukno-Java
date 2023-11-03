package CerneSukno;

public class Osoba implements IPlocha {
    protected int vek;
    protected  int vyska;
    public String pohlavi;
    public Osoba(int vek, int vyska, String pohlavi){
        this.vek=vek;
        this.vyska=vyska;
        this.pohlavi=pohlavi;
    }

    @Override
    public void sdelPlochu() {
        double plocha;
        if(pohlavi=="muz"){
            plocha=vyska/25;
        }else{
            plocha=(vyska/25)*2;
        }
        System.out.println("Osoba plocha: "+plocha );
    }
}