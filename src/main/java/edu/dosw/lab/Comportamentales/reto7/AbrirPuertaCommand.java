package edu.dosw.lab.Comportamentales.reto7;
class AbrirPuertaCommand implements Command {
    private Puerta puerta;
    public AbrirPuertaCommand(Puerta puerta) { this.puerta = puerta; }
    public void execute() { puerta.abrir(); }
    public void undo() { puerta.cerrar(); }
    public String getNombre() { return "Abrir Puerta"; }
}