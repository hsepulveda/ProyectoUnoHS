
public class Gasto {

    private String descripcion;
    private int valor;
    private boolean pagado;

    Gasto(String descripcion, int valor, boolean pagado) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.pagado = pagado;
    }

    public int getValor() {
        return valor;
    }
}
