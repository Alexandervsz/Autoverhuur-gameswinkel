import java.time.LocalDate;
public class RunMe {
    public static void main(String[] kwargs) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden


        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);


        Person p1 = new Person("Eric", 200);
        Person p2 = new Person("Hans", 55);
        Person p3 = new Person("Arno", 185);


        // Druk de volgende transacties af (pas de code aan)
        System.out.println("p1 koopt g1: "+p1.koop(g1));
        System.out.println("p1 koopt g2: "+p1.koop(g2));
        System.out.println("p1 koopt g3: "+p1.koop(g3));
        System.out.println("p2 koopt g2: "+p2.koop(g2));
        System.out.println("p2 koopt g1: "+p2.koop(g1));
        System.out.println("p3 koopt g3: "+p3.koop(g3)+"\n");


        // Druk personen p1 p2 p3 nu af naar de console
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        System.out.println("p3: "+p3);



        // Druk de volgende transacties af (pas de code aan)
        System.out.println("p1 verkoopt g1 aan p3: "+p1.verkoop(g1, p3));
        System.out.println("p2 verkoopt g2 aan p3: "+p2.verkoop(g2, p3));
        System.out.println("p2 verkoopt g1 aan p1: "+p2.verkoop(g1, p1)+"\n");


        // Druk personen p1 p2 p3 nu af naar de console
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        System.out.println("p3: "+p3);
    }



}
