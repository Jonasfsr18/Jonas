package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        //Valores decimal
        double raio = 3.4;

        //Define o valor final (fixo)
        final double pi = 3.14159;

        double area = pi * raio * raio;
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Área = " + area + "m².");
    }
}
