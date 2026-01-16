import java.util.*;

public class Team {
    private final List<Worker> members;

    public Team(List<Worker> members) {
        this.members = Collections.unmodifiableList(new ArrayList<>(members));
    }

    public List<Worker> getMembers() { return members; }

    public void print() {
        System.out.println("=== TEAM MEMBERS (" + members.size() + ") ===");
        for (Worker w : members) System.out.println(w);
        System.out.println();
    }
}
