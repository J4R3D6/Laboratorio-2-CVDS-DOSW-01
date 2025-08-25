package edu.dosw.lab.Comportamentales.reto7;
interface Command {
    void execute();
    void undo();
    String getNombre();
}
