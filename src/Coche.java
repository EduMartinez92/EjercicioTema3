import java.util.Scanner;

public class Coche {
    private int numPuertas;
    private String marca=new String();


        public Coche(int puert,String mar)
        {
            setNumPuertas(puert);
            setMarca(mar);
        }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void incrementarPuertas(){
        System.out.println("Introduzca el número de puertas que desea incrementar");
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        numPuertas += a;
    }
}



