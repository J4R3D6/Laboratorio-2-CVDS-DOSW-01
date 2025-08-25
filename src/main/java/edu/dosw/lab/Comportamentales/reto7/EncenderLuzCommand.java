package edu.dosw.lab.Comportamentales.reto7;
class EncenderLuzCommand implements Command {
    private Luz luz;
    public EncenderLuzCommand(Luz luz) { this.luz = luz; }
    public void execute() { luz.encender(); }
    public void undo() { luz.apagar(); }
    public String getNombre() { return "Encender Luz"; }
}
