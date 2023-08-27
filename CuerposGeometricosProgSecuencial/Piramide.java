import java.util.Scanner;

public class Piramide{
    
    public static void main(String [] args){
       Scanner  lector = new Scanner(System.in);

     double perimetroBase, apotemaPiramideCuadrado, altura, apotema, lados, apotemaPiramide;
     double areaLateral, areaTotal, volumen, areaBase;

     System.out.println("apotema: ");
     apotema = lector.nextDouble();

     System.out.println("Lados: ");
     lados = lector.nextDouble();

     System.out.println("Altura");
     altura = lector.nextDouble();

     perimetroBase = apotema * lados;
     apotemaPiramideCuadrado = Math.pow(apotema,2) + Math.pow(altura,2);

     apotemaPiramide = Math.sqrt (apotemaPiramideCuadrado);
     areaLateral = perimetroBase * apotemaPiramide/2;

     areaBase = perimetroBase * apotema/2;
     areaTotal = areaLateral + areaBase;

     volumen = areaBase * altura/3;

     System.out.println("Area lateral: " +areaLateral);

     System.out.println("Area total: " +areaTotal);

     System.out.println("Volumen: " +volumen);
     lector.close();

     }

}
