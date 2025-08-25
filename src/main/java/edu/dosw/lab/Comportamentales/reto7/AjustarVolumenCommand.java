package edu.dosw.lab.Comportamentales.reto7;
class AjustarVolumenCommand implements Command {
    private Volumen volumen;
    private int valor;
    public AjustarVolumenCommand(Volumen volumen, int valor) {
        this.volumen = volumen;
        this.valor = valor;
    }
    public void execute() { volumen.ajustar(valor); }
    public void undo() { volumen.reset(); }
    public String getNombre() { return "Ajustar Volumen a " + valor; }
}

