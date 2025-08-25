package edu.dosw.lab.Comportamentales.reto7;


class ReproducirMusicaCommand implements Command {
    private Musica musica;
    public ReproducirMusicaCommand(Musica musica) { this.musica = musica; }
    public void execute() { musica.reproducir(); }
    public void undo() { musica.detener(); }
    public String getNombre() { return "Reproducir Música"; }
}
