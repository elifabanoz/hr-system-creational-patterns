public abstract class BaseWorker implements Worker {
    protected final String id;
    protected final String name;
    protected final String type;
    protected final String role;

    protected BaseWorker(String id, String name, String type, String role) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.role = role;
    }

    @Override public String getId() { return id; }
    @Override public String getName() { return name; }
    @Override public String getType() { return type; }
    @Override public String getRole() { return role; }

    @Override
    public String toString() {
        return String.format("[%s] %-24s | Type=%-12s Role=%s", id, name, type, role);
    }
}
