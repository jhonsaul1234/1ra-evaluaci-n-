import java.util.Scanner;
public class Saul {
    public static void opciones() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===ELIGA UNA OPCION===\n1. Comprar gasolina\n2. Compra de gas\n3.Compra de Lubricantes\n4.Tienda Listol\n5.sala de comunicaciones\n6.Carwash");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                comprarGasolina(sc);
                break;
            case 2:
                comprarGas(sc);
                break;

            case 3:
                comprarLubricantes(sc);

                break;
            case 4:
                CompraListol(sc);
                break;
            case 5:
                cumunicaciones();
                break;


            default:
                System.out.println("Opción no válida.");
                break;

        }

        sc.close();
    }

    public static void comprarGasolina(Scanner gaa) {
        System.out.println("\nTipos de gasolina disponibles:");
        System.out.println("1. Max-D - S/15.99 por galón");
        System.out.println("2. G-Regular - S/16.79 por galón");
        System.out.println("3. G-Premium - S/17.99 por galón");

        int tipoGasolina;
        do {
            System.out.print("Ingrese el tipo de gasolina (1, 2, 3): ");
            tipoGasolina = gaa.nextInt();

            if (tipoGasolina < 1 || tipoGasolina > 3) {
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (tipoGasolina < 1 || tipoGasolina > 3);

        System.out.print("Cantidad de galones: ");
        int cantidadGasolina = gaa.nextInt();

        double precioGasolina = 0;
        switch (tipoGasolina) {
            case 1:
                precioGasolina = 15.99;
                break;
            case 2:
                precioGasolina = 16.79;
                break;
            case 3:
                precioGasolina = 17.99;
                break;
        }
        double totalGasolina = precioGasolina * cantidadGasolina;
        System.out.println("\n--- Métodos de Pago ---");
        System.out.println("1- Pago en Efectivo");
        System.out.println("2- Pago con Tarjeta");

        System.out.print("Seleccione el método de pago (1 o 2): ");
        int metodoPago = gaa.nextInt();

        switch (metodoPago) {
            case 1:
                System.out.println("\n--- Pago en Efectivo ---");
                System.out.println("Son  " + totalGasolina + " en total");
                System.out.println("Compra exitosa. Total pagado en efectivo: S/ " + totalGasolina);
                break;
            case 2:
                System.out.println("\n--- Pago con Tarjeta de Crédito ---");

                System.out.print("Ingrese el número de la tarjeta de crédito: ");
                String numeroTarjeta = gaa.next();

                System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                String fechaVencimiento = gaa.next();

                System.out.print("Ingrese el código CVV: ");
                String cvv = gaa.next();

                if (VerificarTarjeta(numeroTarjeta, fechaVencimiento, cvv, totalGasolina)) {
                    System.out.println("Compra exitosa. Total pagado: S/ " + totalGasolina);
                } else {
                    System.out.println("Datos de tarjeta inválidos. Pago fallido. Intente nuevamente.");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static boolean VerificarTarjeta(String numeroTarjeta, String fechaVencimiento, String cvv, double monto) {
        if (numeroTarjeta.length() == 16 && fechaVencimiento.length()==5 && cvv.length() == 3) {
            System.out.println("Procesando pago de S/ " + monto + "...");
            return true;
        }
        System.out.println("Datos de tarjeta inválidos.");
        return false;
    }



    public static void comprarGas(Scanner scanner) {
        System.out.println("---  GASES DISPONIBLES ---");
        System.out.println("1- Balón de 10kg ");
        System.out.println("2- Balón de 15kg ");
        System.out.println("3- Balón de 45kg ");

        System.out.print("Ingrese el tipo de gas que desea: (1, 2, 3): ");
        int tipoGas = scanner.nextInt();
        double precioGas = 0;
        switch (tipoGas) {
            case 1:
                precioGas = 50.00;
                break;
            case 2:
                precioGas = 70.00;
                break;
            case 3:
                precioGas = 140.00;
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        double totalGas = precioGas;
        System.out.println("\n--- Métodos de Pago ---");
        System.out.println("1- Pago en Efectivo");
        System.out.println("2- Pago con Tarjeta");

        System.out.print("Seleccione el método de pago (1 o 2): ");
        int metodoPago = scanner.nextInt();

        switch (metodoPago) {
            case 1:
                pagarEnEfectivo(totalGas);
                break;
            case 2:
                if (procesarPagoConTarjeta(scanner, totalGas)) {
                    System.out.println("\nCompra exitosa. Total pagado: S/ " + totalGas);
                } else {
                    System.out.println("\nPago fallido. Intente nuevamente.");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void pagarEnEfectivo(double total) {
        System.out.println("\n--- Pago en Efectivo ---");
        System.out.println("Por favor, pague en caja el monto de S/ " + total);
        System.out.println("Compra exitosa. Total pagado en efectivo: S/ " + total);
    }

    private static boolean procesarPagoConTarjeta(Scanner aulus, double monto) {
        System.out.println("\n--- Pago con Tarjeta de Crédito ---");

        System.out.print("Ingrese el número de la tarjeta de crédito: ");
        String numeroTarjeta = aulus.next();

        System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
        String fechaVencimiento = aulus.next();

        System.out.print("Ingrese el código CVV: ");
        String cvv = aulus.next();

        boolean pagoExitoso = verificarTarjeta(numeroTarjeta, fechaVencimiento, cvv, monto);

        return pagoExitoso;
    }
    private static boolean verificarTarjeta(String numeroTarjeta, String fechaVencimiento, String cvv, double monto) {

        if (numeroTarjeta.length() == 16 && fechaVencimiento.length()==4 && cvv.length() == 3) {
            System.out.println("Procesando pago de S/ " + monto + "...");
            return true;
        }
        System.out.println("Datos de tarjeta inválidos.");
        return false;
    }
    public static void  comprarLubricantes(Scanner Scanner) {
        System.out.println("\nlubricantes disponibles disponibles:");
        System.out.println("1-lubricante para motores diesel ---> S/ 190.00");
        System.out.println("2-lubricante para motores gasolina  ---> S/ 175.00");

        System.out.print("Ingrese el lubricante que desea (diesel,gasolina):\n");
        String lubricante = Scanner.next();
        System.out.print("Ingrese la cantidad:\n");
        int cantidad_lubricante = Scanner.nextInt();
        double precio_lubricante;
        switch (lubricante.toLowerCase()) {
            case "diesel":
                precio_lubricante = 190;
                break;
            case "gasolina":
                precio_lubricante = 175;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        double total_lubricante = precio_lubricante * cantidad_lubricante;
        System.out.println("\nCompra exitosa.\nTotal a pagar por lubricante: S/ " + total_lubricante);
    }
    public static void CompraListol(Scanner scanner) {

        boolean continuarPedido = true;
        double totalPedido = 0.0;

        System.out.println("¡¡BUEN DIA!! Que se le ofrece trgar, hamburguesa o bebidas");
        System.out.println("------OJO------Una vez que haya finalizado sus compras, cancele el proceso- seleccionando el N°8");
        System.out.println("Selecione el ----N°---- que quiera para hacer su compra");

        while (continuarPedido) {
            System.out.println("\nMenú:");
            System.out.println("1. Clasica -  S/2.00");
            System.out.println("2. Queso - S/1.50");
            System.out.println("3. Queso y jamon - S/3.00");
            System.out.println("4. Queso y tocino - S/2.50");
            System.out.println("5. Gaseosa - S/2.00");
            System.out.println("6. Cafe - S/1.50");
            System.out.println("7. Té - S/1.00");
            System.out.println("8. Cancelar el pedido");

            System.out.print("\nIngrese el número de su elección: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de hamburguesas Clasica: ");
                    int cantidad1 = scanner.nextInt();
                    totalPedido += cantidad1 * 2.00;
                    System.out.println("Su hamburguesa Clasica: S/" + (cantidad1 * 2.00));
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de hamburguesas de Queso: ");
                    int cantidad2 = scanner.nextInt();
                    totalPedido += cantidad2 * 1.50;
                    System.out.println("Su hamburguesa de Queso:S/" + (cantidad2 * 1.50));
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de hamburguesas de Queso y jamon: ");
                    int cantidad3 = scanner.nextInt();
                    totalPedido += cantidad3 * 3.00;
                    System.out.println("Su hamburguesa de Queso y jamon: S/" + (cantidad3 * 3.00));
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de hamburguesas de Queso y tocino: ");
                    int cantidad4 = scanner.nextInt();
                    totalPedido += cantidad4 * 2.50;
                    System.out.println("Su hamburguesa de Queso y tocino: S/" + (cantidad4 * 2.50));
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de Gaseosas: ");
                    int cantidad5 = scanner.nextInt();
                    totalPedido += cantidad5 * 2.00;
                    System.out.println("Su Gaseosa:S/" + (cantidad5 * 2.00));
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad de Cafés: ");
                    int cantidad6 = scanner.nextInt();
                    totalPedido += cantidad6 * 1.50;
                    System.out.println("Su Café: S/" + (cantidad6 * 1.50));
                    break;
                case 7:
                    System.out.print("Ingrese la cantidad de Tés: ");
                    int cantidad7 = scanner.nextInt();
                    totalPedido += cantidad7 * 1.00;
                    System.out.println("Su Té: S/" + (cantidad7 * 1.00));
                    break;
                default:
                    System.out.println("--Opción inválida-- seleccione el N° del menú.");
                    return;
            }
        }

        System.out.println("\nGracias por su compra, vuelva pronto. Su total es: S/" + totalPedido);
        scanner.close();
    }

    public static void cumunicaciones() {
        Scanner gaa = new Scanner(System.in);
        System.out.println("===NOTICAS RELEVANTES===\n1. COMUNICADO GRUPO PRIMAX – MAYO 20 DEL 2024\n2. Educación digital inclusiva: Más de 100 estudiantes del CEBE Corazón de María de Magdalena se benefician con laboratorio de cómputo donado por Primax\n3.PRIMAXGAS POTENCIA SU SERVICIO DE DELIVERY Y LANZA SU NUEVO CANAL DE VENTAS DIGITAL\n4.GNV ¿POR QUÉ ES CONSIDERADO UNA ENERGÍA ECO AMIGABLE?\n5.PRIMAX RENUEVA SU ESTACIÓN DE SERVICIOS UBICADA EN EL KILÓMETRO 97 DE ASIA");
        int opciones = gaa.nextInt();

        switch (opciones) {
            case 1:
                comunicado(gaa);
                break;

            case 2:
                educacion(gaa);
                break;
            case 3:
                potencia(gaa);
                break;
            case 4:
                GNV(gaa);
            case 5:
                RENUEVA(gaa);
            default:
                System.out.println("Opción no válida.");
                break;
        }

        gaa.close();
    }



    public static void comunicado(Scanner scanner) {
        System.out.println("Lima, 20 de mayo del 2024. Sobre la explosión ocurrida esta tarde en una planta de compresión de Gas Natural contigua a una estación de servicios, de propiedad y operada por un socio afiliado a nuestra marca, ubicada en Villa María del Triunfo, Grupo Primax informa a la opinión pública:\n" +
                "\n" +
                "Que lamentamos profundamente lo ocurrido y expresamos nuestro sentido pésame a la familia de la persona que ha fallecido en este accidente y nuestra total solidaridad con los heridos reportados hasta el momento.\n" +
                "\n" +
                "Desde Grupo Primax, nuestra prioridad son las personas, por lo que desde que se tomó conocimiento de este lamentable accidente, nos pusimos en contacto con el propietario de la estación de servicios, para acompañar la atención de la emergencia.\n" +
                "\n" +
                "Con relación a las causas del accidente, estas aún son materia de investigación por parte de las autoridades. Desde Grupo Primax lamentamos nuevamente lo ocurrido y reafirmamos nuestro total compromiso con los heridos y familiares de la víctima.:");

    }

    public static void educacion (Scanner scanner) {
        System.out.println("Gracias a la donación del laboratorio de cómputo, 120 estudiantes de la institución se beneficiarán con la conectividad y acceso digital para seguir potenciando sus capacidades.\n" +
                "Lima, mayo del 2024. PRIMAX, empresa líder en el sector energético, como parte de su programa de responsabilidad social y sostenibilidad “Energía que nos conecta” implementó la donación del laboratorio de cómputo al Centro de Educación Básica Especial “Corazón de María”, de Magdalena.");

    }
    public static void potencia(Scanner scanner){
        System.out.println("Con este lanzamiento, la marca busca mejorar la experiencia de sus usuarios innovando en el e-commerce\n" +
                "Tras un año marcado por una tendencia en donde más de 23 millones de peruanos adoptaron los canales digitales en sus hábitos de compra debido a la practicidad, conveniencia y ahorro de tiempo; Primaxgas, la marca de gas doméstico de Primax, dio un paso significativo hacia la innovación de su servicio, anunciando el lanzamiento de su nueva plataforma online para la comercialización de balones de gas en Perú.");
    }
    public static void GNV(Scanner scanner){
        System.out.println("El Perú es rico en un recurso energético clave para la transición energética: el gas natural. Extraído desde Camisea, en Cusco, el gas natural para su uso vehicular o GNV, se ha convertido en un aliado de los transportistas y del medio ambiente, siendo conocido como un combustible ‘eco amigable’, ya que produce un 25% menos de dióxido de carbono (CO2) en comparación con la gasolina y en menos de 150% si se compara con el diésel.\n" +
                "\n" +
                "Los especialistas mencionan que esta energía es mucho más limpia porque además de generar menos emisiones de CO2 por cada kilómetro recorrido, genera mínimas cantidades de azufre, mercurio y otras partículas, lo que la convierte en una energía que ayuda a disminuir el calentamiento global, reducir el efecto invernadero y mejorar la calidad del aire.");
    }
    public static void RENUEVA(Scanner scanner){
        System.out.println("PRIMAX,compañía líder en el sector energía, presentó las instalaciones remodeladas de su estación de servicio ubicada en el kilómetro 97 de la Panamericana Sur en Asia. El rediseño de esta estación que forma parte de la estrategia de la marca de seguir brindando a sus clientes una experiencia de consumo memorable contempla un ecosistema de servicios en un área de más de 4 mil metros cuadrados que incluye la tienda de conveniencia de la marca, LiSTO! y una renovada zona de recarga de combustible.\n" +
                "\n" +
                "La remodelación de la estación también contempla la implementación de una señalética, un “pole sign” o poste de señal, que facilita la visibilidad de los conductores y peatones. Asimismo, para incentivar la visita a su estación, la marca tiene promociones y beneficios exclusivos para sus clientes que incluyen descuentos en la categoría de comida rápida, cervezas y licores. De igual manera, para el consumo de su combustible premium G-PREMIUM G-PRIX, ofrecen quintuplicar puntos Bonus por cada tanqueada.");

    }





    public static void main(String[] args) {
        System.out.println("===BIENVENIDO AL GRIFO PRIMAX===");
        Scanner sc = new Scanner(System.in);


        opciones();

        sc.close();
    }
}
