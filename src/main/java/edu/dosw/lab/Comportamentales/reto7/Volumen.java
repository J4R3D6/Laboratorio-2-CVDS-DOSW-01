package edu.dosw.lab.Comportamentales.reto7;

class Volumen {
    private int nivel = 50;
    public void ajustar(int valor) {
        try {
            if (valor < 0 || valor > 100) {
                throw new IllegalArgumentException("Volumen no compatible");
            }
            nivel = valor;
            System.out.println("🔊 Volumen ajustado a " + nivel);
        }catch (IllegalArgumentException e) {
            this.reset();
        }
    }
    public void reset() {
        nivel = 50;
        System.out.println("🔊 Volumen restaurado a " + nivel);
    }
}
