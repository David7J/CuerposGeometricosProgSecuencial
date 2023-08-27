import java.util.Scanner;

public class TroncoCono {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        double generatriz, radio, radioMayor, altura, areaBaseMayor, areaBaseMenor, Pixal, radiosCuadrados,radxrad;
        double areaLateral, areaTotal, volumen, totalVol;

        System.out.println("radio: ");
        radio = lector.nextDouble();

        System.out.println("altura: ");
        altura = lector.nextDouble();

        System.out.println("radio Mayor: ");
        radioMayor = lector.nextDouble();

        System.out.println("generatriz: ");
        generatriz = lector.nextDouble();

        areaLateral = (Math.PI*generatriz) *(radioMayor + radio);

        areaBaseMayor = Math.PI* Math.pow(radioMayor,2);
        areaBaseMenor = Math.PI* Math.pow(radio,2);
        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;

        Pixal = (Math.PI * altura); 
        radiosCuadrados = ((Math.pow(radioMayor,2)) + (Math.pow(radio,2)));
        radxrad = radioMayor * radio;
        volumen = Pixal * (radiosCuadrados + radxrad);
        totalVol = volumen/3;

        System.out.println("Area lateral: " +areaLateral);

        System.out.println("Area total: " +areaTotal);

        System.out.println("volumen: " +volumen);

        System.out.println("total volumen: " +totalVol);
        lector.close();
    }

}