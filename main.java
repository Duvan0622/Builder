package Vehiculo;

public class main {

    public static void main(String[] args) {

        Vehiculo vehiculo = new VehiculoBuilder()
                .marca("Toyota")
                .modelo("Corolla")
                .tipoVehiculo("Sedán")
                .color("Rojo")
                .placa("ABC1234")
                //.precio(20000.0)
                // .tipoCombustible("Gasolina")
                .cantidadPasajeros(5)
                .disponible(true)
                .build();

        Vehiculo yamahaR1 = new VehiculoBuilder()
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

        Vehiculo yamahaMT07 = new VehiculoBuilder()
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
        System.out.println("yamahaMT07 = " + yamahaMT07);
        
        
        VehiculoBuilder builder = new VehiculoBuilder();
        Director director = new Director(builder);
        Vehiculo yamahaMT07_2 =  director.construirYamahaMT07();
        
        System.out.println("yamahaMT07_2 = " + yamahaMT07_2);
    }
}
