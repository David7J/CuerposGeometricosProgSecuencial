import java.util.Scanner;

public class Cilindro {

    public static void main(String [] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double perimetroBase, altura, radio,areaBase;
        double areaLateral, areaTotal, volumen;

        System.out.println("Altura");
        altura = lector.nextDouble();

        System.out.println("Radio");
        radio = lector.nextDouble();        

        perimetroBase = radio * (Math.PI*2);
        areaLateral = altura * perimetroBase;

        areaBase = (Math.PI) * Math.pow(radio,2);
        areaTotal = areaLateral + 2*areaBase;

        volumen = areaBase * altura;

        System.out.println("Area lateral: " +areaLateral + " unidades cuadradas" );
        
        System.out.println("Area total: " +areaTotal + " unidades cuadradas");

        System.out.println("Volumen: " +volumen + "unidades cubicas");
        lector.close();
        
    }
}
