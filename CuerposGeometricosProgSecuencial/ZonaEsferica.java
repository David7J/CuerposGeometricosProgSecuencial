import java.util.Scanner;

public class ZonaEsferica {
  
    public static void main(String [] args){
        Scanner  lector = new Scanner(System.in);

        double porcionEsfera, porcionSuperficie;
        double radioMenor, altura, radioMayor, radio;

        System.out.println("radio: ");
        radio = lector.nextDouble();

        System.out.println("altura: ");
        altura = lector.nextDouble();

        System.out.println("radio mayor: ");
        radioMayor = lector.nextDouble();

        System.out.println("radio menor: ");
        radioMenor = lector.nextDouble();

        porcionSuperficie = (2*Math.PI) * radioMayor * altura;

        porcionEsfera = (Math.PI*altura) * (Math.pow(altura,2) + 3*(Math.pow(radio,2)) + 3*(Math.pow(radioMenor,2))/6 );

        System.out.println("Porcion de Superficie: " +porcionSuperficie);
        System.out.println("Porcion de Esfera: " +porcionEsfera);
        lector.close();
   }
}