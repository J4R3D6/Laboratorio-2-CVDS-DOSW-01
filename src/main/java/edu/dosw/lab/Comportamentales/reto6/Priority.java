package edu.dosw.lab.Comportamentales.reto6;
public enum Priority {
    LOW(1), MEDIUM(2), HIGH(3);
    private final int value;
    Priority(int value) { this.value = value; }
    public int getValue() { return value; }
}