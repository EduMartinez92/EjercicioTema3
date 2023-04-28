import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumatorio());
        Scanner s = new Scanner(System.in);


        Coche miCoche=new Coche(1,"seat");

        miCoche.incrementarPuertas();
        System.out.println("El número de puertas es: " + miCoche.getNumPuertas());

    }


    public static int sumatorio(){
        int a, b, c;
        int resultado;
        Scanner s = new Scanner(System.in);


        System.out.println("Introduzca 3 números");
        a = s.nextInt();
        b= s.nextInt();
        c= s.nextInt();
        resultado = a+b+c;

        return resultado;
    }


}