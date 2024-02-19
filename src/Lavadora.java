//Clase eredada de "Electrodomestico"
public class Lavadora extends Electrodomestico{
    private double Precio;

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    private boolean aguaCaliente;

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "Precio=" + Precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente=false;
    }

    public Lavadora(String marca, Double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        Precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getCosteConsumo(int horas){
        if (!this.aguaCaliente){ //agua fria
            horas*super.setPotencia(Potencia);
        } else { //agua caliente

        }
    }
}