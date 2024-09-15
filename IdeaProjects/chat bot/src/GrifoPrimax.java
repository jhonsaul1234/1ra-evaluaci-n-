public class GrifoPrimax {
    private boolean abierto;
    private int temperatura; // En grados Celsius
    private int caudal; // En litros por minuto

    public GrifoPrimax() {
        this.abierto = false;
        this.temperatura = 20; // Temperatura ambiente por defecto
        this.caudal = 5; // Caudal por defecto
    }

    public void abrir() {
        if (!abierto) {
            abierto = true;
            System.out.println("El grifo está abierto.");
        } else {
            System.out.println("El grifo ya está abierto.");
        }
    }

    public void cerrar() {
        if (abierto) {
            abierto = false;
            System.out.println("El grifo está cerrado.");
        } else {
            System.out.println("El grifo ya está cerrado.");
        }
    }

    public void regularTemperatura(int nuevaTemperatura) {
        if (nuevaTemperatura < 0 || nuevaTemperatura > 100) {
            System.out.println("Temperatura fuera de rango. Debe estar entre 0 y 100 grados Celsius.");
        } else {
            temperatura = nuevaTemperatura;
            System.out.println("La temperatura se ha ajustado a " + temperatura + " grados Celsius.");
        }
    }

    public void regularCaudal(int nuevoCaudal) {
        if (nuevoCaudal < 1 || nuevoCaudal > 10) {
            System.out.println("Caudal fuera de rango. Debe estar entre 1 y 10 litros por minuto.");
        } else {
            caudal = nuevoCaudal;
            System.out.println("El caudal se ha ajustado a " + caudal + " litros por minuto.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado del grifo:");
        System.out.println("Abierto: " + (abierto ? "Sí" : "No"));
        System.out.println("Temperatura: " + temperatura + " grados Celsius");
        System.out.println("Caudal: " + caudal + " litros por minuto");
    }

    public static void main(String[] args) {
        GrifoPrimax grifo = new GrifoPrimax();
        grifo.mostrarEstado();
        grifo.abrir();
        grifo.regularTemperatura(35);
        grifo.regularCaudal(7);
        grifo.mostrarEstado();
        grifo.cerrar();
        grifo.mostrarEstado();
    }
}