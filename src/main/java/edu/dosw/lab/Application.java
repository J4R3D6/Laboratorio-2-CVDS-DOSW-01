package edu.dosw.lab;

import edu.dosw.lab.Comportamentales.reto1.Reto1TiendaDeDonPepe;
import edu.dosw.lab.Creacionales.reto2.Reto2ChefDeHamburguesas;
import edu.dosw.lab.Creacionales.reto3.Reto3ElReinoDeLosVehiculos;
import edu.dosw.lab.Comportamentales.reto4.Reto4LaEstafaDeLaCasaDeCambio;
import edu.dosw.lab.Estructurales.reto5.Reto5ElCafePersonalizado;
import edu.dosw.lab.Comportamentales.reto6.Reto6HablaConSoporteTecnico;
import edu.dosw.lab.Comportamentales.reto7.Reto7ControlMagico;

public class Application {
    public static void main(String[] args) {
        System.out.println("✅ Proyecto Maven configurado y corriendo correctamente");
        Reto1TiendaDeDonPepe.ejecutar();
        Reto2ChefDeHamburguesas.ejecutar();
        Reto3ElReinoDeLosVehiculos.ejecutar();
        Reto4LaEstafaDeLaCasaDeCambio.ejecutar();
        Reto5ElCafePersonalizado.ejecutar();
        Reto6HablaConSoporteTecnico.ejecutar();
        Reto7ControlMagico.ejecutar();
    }
}
