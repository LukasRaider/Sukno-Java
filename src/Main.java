import java.util.ArrayList;

class Osoba{
    protected double vek;
    protected int vyska;
    protected String pohlavi;
Osoba(double Vek,int Vyska,String Pohlavi)
{
    vek=Vek;
    vyska=Vyska;
    pohlavi=Pohlavi;
}
    public double sdelPlochu(){
        if(pohlavi =="muz"){
        return (vek * 1.5); }
        else{return (vek * 1.35 * 2);}
    }
}
class Zvire{

    protected int vaha;
    Zvire(int Vaha)
    {
        vaha=Vaha;
    }
    public double sdelPlochu()
    {return vaha*2;}
    //nesmi se vztvorit instance
}
class Pes extends Zvire{
    protected int cena;
    Pes(int Vaha,int Cena)
{
    super(Vaha);
    cena = Cena;
}
    @Override
    public double sdelPlochu() {
        return super.sdelPlochu()*(1/10*cena);
    }
}
class Dum{
    protected int pocetOken;
    protected double pudorys;
    Dum(int PocetOken,Double Pudorys){
        pocetOken=PocetOken;
        pudorys=Pudorys;
    }
public double sdelPlochu(){
    return pudorys;
}
}
class Auto{
    protected int vykon;
    protected double rozmer;
    Auto(int Vykon,double Rozmer){
        vykon = Vykon;
        rozmer = Rozmer;
    }
    public double sdelPlochu(){
        return rozmer;
    }

}
public class Main {
    public static void main(String[] args) {
    Osoba o1 = new Osoba(30,180,"muz");
        Osoba o2 = new Osoba(25,155,"zena");
        Zvire z1 = new Zvire(88);
        Pes p1 = new Pes(55,15000);
        Dum d1 = new Dum(8,250.5);
        Auto a1 = new Auto(230,2500);


        ArrayList<Double> Subject = new ArrayList<Double>();
        Subject.add(o1.sdelPlochu());
        Subject.add(o2.sdelPlochu());
        Subject.add(z1.sdelPlochu());
        Subject.add(p1.sdelPlochu());
        Subject.add(d1.sdelPlochu());
        Subject.add(a1.sdelPlochu());

        double Vlakn=0;
        for (Double i  : Subject)
        {

            Vlakno =+ i;
            System.out.println("Trida je " + i.getClass());
            System.out.println("Obsah je " + i );
        }
        System.out.println("Celkem je " + Vlakno);

    }
}