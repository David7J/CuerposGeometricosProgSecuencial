import java.util.Scanner;

public class Dodecaedro {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
   
        double area, volumen, arista, lado, angulo, apotema, cantidadLados, areaPent;
        

        System.out.println("Arista: ");
        arista = lector.nextDouble();

        System.out.println("Cantidad de lados: ");
        cantidadLados = lector.nextDouble();

        System.out.println("Lado: ");
        lado = lector.nextDouble();

        angulo = 360/ (2*cantidadLados);
        apotema = lado/ 2* (Math.tan(angulo));

        areaPent = 5/2 * (arista * apotema);
        area = 3* Math.pow(arista,2) * (Math.sqrt(25 + 10* Math.sqrt (5)));
        volumen = 1/4 * (15 + 7*Math.sqrt(5) * Math.pow(arista,3));

        System.out.println("Area Pentagonal: " +areaPent);

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);
        lector.close();

    }
}
