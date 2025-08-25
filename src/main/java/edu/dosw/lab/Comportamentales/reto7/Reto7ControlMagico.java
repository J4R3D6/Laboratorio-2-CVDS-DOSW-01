package edu.dosw.lab.Comportamentales.reto7;

import java.util.Scanner;

public class Reto7ControlMagico {
        public static void ejecutar() {
            Scanner sc = new Scanner(System.in);
            ControlRemoto control = new ControlRemoto();
            Luz luz = new Luz();
            Puerta puerta = new Puerta();
            Musica musica = new Musica();
            Volumen volumen = new Volumen();
            System.out.print("Número de acciones a registrar: ");
            int n = sc.nextInt(); sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.println("\nAcción " + i + ":");
                System.out.print("Usuario: ");
                String usuario = sc.nextLine();
                System.out.println("Seleccione acción: ");
                System.out.println("1. Encender Luz\n2. Abrir Puerta\n3. Reproducir Música\n4. Ajustar Volumen");
                int opcion = sc.nextInt(); sc.nextLine();
                Command cmd = null;
                switch (opcion) {
                    case 1 -> cmd = new EncenderLuzCommand(luz);
                    case 2 -> cmd = new AbrirPuertaCommand(puerta);
                    case 3 -> cmd = new ReproducirMusicaCommand(musica);
                    case 4 -> {
                        System.out.print("Ingrese valor (0-100): ");
                        int valor = sc.nextInt(); sc.nextLine();
                        cmd = new AjustarVolumenCommand(volumen, valor);
                    }
                }
                if (cmd != null) {
                    control.ejecutarAccion(cmd, usuario);
                    System.out.print("¿Deshacer acción? (si/no): ");
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        control.deshacerUltima(usuario);
                    }
                }
            }
            control.mostrarHistorial();
            sc.close();
        }
}

