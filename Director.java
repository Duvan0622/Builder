package Vehiculo;

public class Director {
    private VehiculoBuilder builder;

    public Director(VehiculoBuilder builder) {
        this.builder = builder;
    }


    public Vehiculo construirYamahaR1() {
        return builder
                .marca("Yamaha")
                .modelo("YZF-R1")
                .tipoVehiculo("Motocicleta")
                .color("Negro")
                .placa("YAM123")
                .precio(15000.0)
                .tipoCombustible("Gasolina")
                .cantidadPasajeros(2)
                .disponible(true)
                .build();
    }

    public Vehiculo construirYamahaMT07() {
        return builder
                .marca("Yamaha")
                .modelo("MT-07")
                .tipoVehiculo("Motocicleta")
                .color("Negro")
                .placa("YAM456")
                .precio(7500.0)
                .tipoCombustible("Gasolina")
                .cantidadPasajeros(2)
                .disponible(true)
                .build();
    }
}
