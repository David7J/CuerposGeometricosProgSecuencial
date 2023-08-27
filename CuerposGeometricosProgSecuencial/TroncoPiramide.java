import java.util.Scanner;

public class TroncoPiramide {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double perimetroBaseMenor, perimetroBaseMayor, areaBaseMayor, areaBaseMenor, lado1, lado2, apotema, altura;
        double areaLateral, areaTotal, volumen;

        System.out.println("lado 1:");
        lado1 = lector.nextDouble();
        
        System.out.println("lado 2:");
        lado2 = lector.nextDouble();

        System.out.println("apotema: ");
        apotema = lector.nextDouble();

        System.out.println("altura: ");
        altura = lector.nextDouble();

        perimetroBaseMayor = lado1 * 4;
        perimetroBaseMenor = lado2 * 4;

        areaLateral = (perimetroBaseMayor + perimetroBaseMenor) * apotema/2;

        areaBaseMayor = lado1 * lado1;
        areaBaseMenor = lado2 * lado2;
        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;

        volumen = (areaBaseMayor + areaBaseMenor) + (lado1*lado2) *altura/3;

        System.out.println("Area lateral: " +areaLateral);

        System.out.println("Area total: "+areaTotal);

        System.out.println("volumen: " +volumen);
        lector.close();
    }
}
