package edu.dosw.lab.Comportamentales.reto7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ControlRemoto {
    private List<String> historial = new ArrayList<>();
    private Stack<Command> pilaUndo = new Stack<>();

    public void ejecutarAccion(Command comando, String usuario) {
        comando.execute();
        historial.add(usuario + " ejecutó -> " + comando.getNombre());
        pilaUndo.push(comando);
    }

    public void deshacerUltima(String usuario) {
        if (!pilaUndo.isEmpty()) {
            Command c = pilaUndo.pop();
            c.undo();
            historial.add(usuario + " DESHIZO -> " + c.getNombre());
        } else {
            System.out.println("⚠️ No hay acciones para deshacer");
        }
    }

    public void mostrarHistorial() {
        System.out.println("\n📜 HISTORIAL DE ACCIONES:");
        historial.forEach(System.out::println);
    }
}
