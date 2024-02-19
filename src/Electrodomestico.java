//de las clases abstractas no se pueden crear objetos
//si un metodo es abstracto la clase entera tambien
public abstract class Electrodomestico {

    protected String Tipo;

    protected String Marca;

    protected double Potencia;

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Potencia=" + Potencia +
                '}';
    }

    public Electrodomestico(String marca, double potencia) {
        Marca = marca;
        Potencia = potencia;
    }

    public Electrodomestico(String tipo, String marca, Double potencia) {
        this.Tipo = tipo;
        this.Marca = marca;
        this.Potencia = potencia;
    }

    //metodo abstracto--> Solo se define, no tiene código
    public abstract double getConsumo(int horas);

    public double getCosteConsumo(int horas, double costeHora){
        return horas*costeHora;
    }
}