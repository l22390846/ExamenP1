import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int N1 = 0;
        int N2 = 0;
        double Resta;
        int divicion1,divicion2;


        System.out.println("ingrese el primer número \n");
        N1 = dato.nextInt();


        System.out.println("ingrese el segundo número \n");
        N2 = dato.nextInt();

        Resta = N1 - N2;

        //_____________________________________________________

        divicion1 = N1 / 10 ;
        divicion2 =  N2/ 10;

        System.out.println("\n el resiltado de la resta es " + Resta);

        System.out.println(" \n el resiltado de la divicion del numero 1  es " + divicion1);

        System.out.println("\n el resiltado de la divicion del numero 2  es " + divicion2);


    }






}