//Clase eredada de "Electrodomestico"
public class Lavadora extends Electrodomestico{
    protected double Precio;

    boolean aguaCaliente;

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

    public double getConsumo(int horas){
        if (!this.aguaCaliente){ //agua fria
            return horas*this.Potencia;
        } else { //agua caliente
            return horas*(this.Potencia+this.Potencia*0.2);
        }
    }
}