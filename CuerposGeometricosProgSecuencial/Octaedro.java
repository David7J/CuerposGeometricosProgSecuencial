import java.util.Scanner;

public class Octaedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double arista, area, volumen;

        System.out.println("Arista: ");
        arista = lector.nextDouble();

        area = 2* Math.pow(arista,2) * Math.sqrt(3);
        volumen = Math.sqrt(2)/3 * Math.pow(arista,3);

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);
        lector.close();
    }
}
