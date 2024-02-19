//de las clases abstractas no se pueden crear objetos
//si un metodo es abstracto la clase entera tambien
public abstract class Electrodomestico {

    private String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    private String Marca;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    private double Potencia;

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

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

    public abstract double getCosteConsumo(int horas, double costeHora);
}