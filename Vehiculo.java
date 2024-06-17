package Vehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String tipoVehiculo;
    private String color;
    private String placa;
    private double precio;
    private String tipoCombustible;
    private int cantidadPasajeros; 
    private boolean disponible;

    public Vehiculo(String marca, String modelo, String tipoVehiculo, String color, String placa,
                    double precio, String tipoCombustible, int cantidadPasajeros, boolean disponible){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
        this.placa = placa;
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.disponible = disponible;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", tipoVehiculo=" + tipoVehiculo + ", color=" + color + ", placa=" + placa + ", precio=" + precio + ", tipoCombustible=" + tipoCombustible + ", cantidadPasajeros=" + cantidadPasajeros + ", disponible=" + disponible + '}';
    }
}

