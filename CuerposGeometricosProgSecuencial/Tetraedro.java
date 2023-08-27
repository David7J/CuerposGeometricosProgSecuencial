import java.util.Scanner;

public class Tetraedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double arista, area, volumen, altura;

        System.out.println("Arista: ");
        arista = lector.nextDouble();

        area = Math.pow(arista,2) * Math.sqrt(3);

        volumen = Math.sqrt(2)/12 * Math.pow((area),3);

        altura = arista * Math.sqrt(6)/3;

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);

        System.out.println("Altura: " +altura);
        lector.close();

    }
}
