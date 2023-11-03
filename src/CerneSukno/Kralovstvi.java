package CerneSukno;
import java.util.ArrayList;
public class Kralovstvi {
    public static void main(String[] args) {
        Osoba o1 = new Osoba(28, 185, "muz");
        Pes p1 = new Pes(25, 180);
        Dum d1 = new Dum(6, 180);
        IPlocha[] kralovstvi = {o1, p1, d1};
        System.out.println("Výpis pole: ");
        for (IPlocha item : kralovstvi) {
            item.sdelPlochu();
        }
        Auto a1 = new Auto(1500);
        ArrayList<IPlocha> pohadka = new ArrayList<>();
        pohadka.add(o1);
        pohadka.add(p1);
        pohadka.add(d1);
        pohadka.add(a1);
        System.out.println("\nVýpis kolekce: ");
        for (IPlocha i : pohadka) {
            i.sdelPlochu();
        }
        System.out.println((kralovstvi[0]) instanceof Osoba ? ((Osoba) (kralovstvi[0])).vek :((kralovstvi[0]) instanceof Zvire)?((Zvire)(kralovstvi[0])).vaha :((Dum)(kralovstvi[0])).pocetOken);


    }
}