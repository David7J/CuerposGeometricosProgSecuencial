import java.util.Scanner;

public class Icosaedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double area, vol, arista;

        System.out.println("Arista: ");
        arista = lector.nextDouble();

        area = 5* Math.pow(arista,2) * Math.sqrt(3);
        vol = 5/12 * (3 + Math.sqrt(5)) * Math.pow(arista,3);

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +vol);
        lector.close();
    

    }
}
