import java.util.Scanner;

public class HusoEsferico {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double radio, grados;
        double area, volumen;

        System.out.println("grados: ");
        grados = lector.nextDouble();

        System.out.println("radio: ");
        radio = lector.nextDouble();
 
        area = (4*Math.PI) * (Math.pow(radio,2)) * grados/360;

        volumen = 4/3* (Math.PI) * (Math.pow(radio,3)) * radio/360;

        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);
        lector.close();

    }
}
