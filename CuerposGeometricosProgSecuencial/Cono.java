import java.util.Scanner;

public class Cono {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double radio, altura, generatriz, generatrizCuadrada, areaBase;
        double areaLateral, areaTotal, volumen;

        System.out.println("altura: ");
        altura = lector.nextDouble();

        System.out.println("radio: ");
        radio = lector.nextDouble();

        generatrizCuadrada = Math.pow(altura,2) + Math.pow(radio,2);
        generatriz = Math.sqrt (generatrizCuadrada);

        areaLateral = (Math.PI *radio) * generatriz;

        areaBase = Math.PI * Math.pow(radio,2);
        areaTotal = areaLateral + areaBase;

        volumen = areaBase * altura/3;
        
        System.out.println("Area lateral: " +areaLateral);

        System.out.println("Area total: " +areaTotal);

        System.out.println("volumen: " +volumen);
        lector.close();

    }

}
