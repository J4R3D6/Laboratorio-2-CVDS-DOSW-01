public class Ticket {
    private final String description;
    private final Level level;
    private final Priority priority;
    private boolean resolved = false;
    private String resolvedBy = "Pending escalation";
    public Ticket(String description, Level level, Priority priority) {
        this.description = description;
        this.level = level;
        this.priority = priority;
    }
    public Level getLevel() { return level; }
    public Priority getPriority() { return priority; }
    public String getDescription() { return description; }
    public boolean isResolved() { return resolved; }
    public String getResolvedBy() { return resolvedBy; }
    public void markResolved(String technician) {
        this.resolved = true;
        this.resolvedBy = technician;
    }
    @Override
    public String toString() {
        return "Level: " + level +
                "\nPriority: " + priority +
                "\nDescription: " + description +
                "\nResolved by: " + resolvedBy + "\n";
    }
}
