public abstract class Technician {
    protected Technician next;
    protected Level level;
    protected Priority maxPriority;
    public Technician(Level level, Priority maxPriority) {
        this.level = level;
        this.maxPriority = maxPriority;
    }
    public void setNext(Technician next) {
        this.next = next;
    }
    public void handleTicket(Ticket ticket) {
        if (ticket.getLevel() == level && ticket.getPriority().getValue() <= maxPriority.getValue()) {
            ticket.markResolved(this.getClass().getSimpleName());
        } else if (next != null) {
            next.handleTicket(ticket);
        }
    }
}