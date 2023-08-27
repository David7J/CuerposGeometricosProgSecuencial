import java.util.Scanner;

public class Esfera {
    public static void main(String [] args){
        Scanner  lector = new Scanner(System.in);
   
        double radio;
        double area, volumen;
        
        System.out.println("Radio");
        radio = lector.nextDouble();
        
        area = (4*Math.PI) * Math.pow(radio,2);
        volumen = 4/3 * (Math.PI* Math.pow(radio,3));
      
        System.out.println("Area: " +area);

        System.out.println("Volumen: " +volumen);
        lector.close();
        

  }
}