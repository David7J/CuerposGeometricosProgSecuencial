import java.util.Scanner;

public class Ortoedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double longitud, profundidad, altura;
        double area, volumen, cDiag, diagonal;

        System.out.println("longitud: ");
        longitud = lector.nextDouble();
        
        System.out.println("profundidad: ");
        profundidad = lector.nextDouble();

        System.out.println("altura: " );
        altura = lector.nextDouble();

        area = 2* ((altura*longitud) + (altura*profundidad) + (longitud*profundidad));

        volumen = altura*longitud*profundidad;

        cDiag = Math.pow(altura,2) + Math.pow(longitud,2) + Math.pow(profundidad,2);
        diagonal = Math.sqrt(cDiag);

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);

        System.out.println("Diagonal: " +diagonal);
        lector.close();
   }
}
