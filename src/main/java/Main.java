
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Gasto> lista = new ArrayList<Gasto>();

        lista.add(new Gasto("Luz", 12000, false));
        lista.add(new Gasto("Agua", 7000, false));
        lista.add(new Gasto("Internet", 30000, false));
        lista.add(new Gasto("Gas", 20000, false));


        double resultado = lista.stream().mapToDouble(gasto -> gasto.getValor() * 1.19)
                .filter(gasto -> gasto < 20000)
                .sum();

        System.out.println(resultado);
    }
}
