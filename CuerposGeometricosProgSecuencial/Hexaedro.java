import java.util.Scanner;

public class Hexaedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double arista, area, volumen, diagonal;

        System.out.println("Arista: ");
        arista = lector.nextDouble();

        area = 6 * Math.pow(arista,2);
        volumen = Math.pow(arista,3);
        diagonal = arista * Math.sqrt(3);

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);

        System.out.println("Diagonal: " +diagonal);
        lector.close();
    }
}