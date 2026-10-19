package automatizacion;

public class MainMotor {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setNombre("Motor Principal");
        motor.setPotencia(150.5);
        motor.setVelocidad(75);
        motor.encender();

        System.out.println("\n--- PROYECTO 2: MOTOR CONTROLADO ---");
        System.out.println("Motor: " + motor.getNombre());
        System.out.println("Potencia: " + motor.getPotencia());
        System.out.println("Velocidad: " + motor.getVelocidad());
        System.out.println("¿Encendido?: " + motor.isEncendido());
    }
}
