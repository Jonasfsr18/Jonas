package Fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {

        java.lang.String b = "Boa tarde!";
        java.lang.System.out.println(b);

        String s = "Boa tarde!";
        System.out.println(s);

        // Sempre se atentar no que está importando

        Date d = new Date();
        java.lang.System.out.println(d);

    }
}
