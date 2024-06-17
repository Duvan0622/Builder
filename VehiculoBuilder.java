package Vehiculo;

public class VehiculoBuilder {
    private String marca;
    private String modelo;
    private String tipoVehiculo;
    private String color;
    private String placa;
    private double precio;
    private String tipoCombustible;
    private int cantidadPasajeros;
    private boolean disponible;

    public VehiculoBuilder() {
    }

    public VehiculoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoBuilder tipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return this;
    }

    public VehiculoBuilder color(String color) {
        this.color = color;
        return this;
    }

    public VehiculoBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public VehiculoBuilder tipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        return this;
    }

    public VehiculoBuilder cantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
        return this;
    }

    public VehiculoBuilder disponible(boolean disponible) {
        this.disponible = disponible;
        return this;
    }

    public Vehiculo build() {
        return new Vehiculo(marca, modelo, tipoVehiculo, color, placa, precio, tipoCombustible, cantidadPasajeros, disponible);
    }
}
