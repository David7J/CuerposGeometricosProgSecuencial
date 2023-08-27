import java.util.Scanner; 

public class CasqueteEsferico {
    
    public static void main(String [] args){
        Scanner  lector = new Scanner(System.in);
 
        double porcionEsfera, porcionSuperficie;
        double altura, radioMayor;

        System.out.println("radio mayor: ");
        radioMayor = lector.nextDouble();

        System.out.println("altura: ");
        altura = lector.nextDouble();


        porcionSuperficie = (2*Math.PI) * radioMayor * altura;

        porcionEsfera = (Math.PI*altura) * (3*radioMayor-altura)/3;

        System.out.println("Porcion de Superficie: " +porcionSuperficie);
        System.out.println("Porcion de Esfera:" +porcionEsfera);
        lector.close();

  } 
}