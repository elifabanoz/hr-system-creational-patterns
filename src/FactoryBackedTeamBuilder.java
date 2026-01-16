import java.util.*;

/**
 * Concrete Builder that uses Factory Method pattern to create workers
 * This demonstrates the combination of Builder and Factory Method patterns
 */
public class FactoryBackedTeamBuilder implements TeamBuilder {
    private final List<Worker> temp = new ArrayList<>();
    private final Map<Role, WorkerCreator> creators = new HashMap<>();

    public FactoryBackedTeamBuilder() {
        // Initialize creators for each role (Factory Method pattern)
        creators.put(Role.Frontend, new FrontendCreator());
        creators.put(Role.Backend, new BackendCreator());
        creators.put(Role.Architect, new ArchitectCreator());
        creators.put(Role.TechnicalManager, new TechnicalManagerCreator());
        creators.put(Role.AdministrativeManager, new AdministrativeManagerCreator());
        creators.put(Role.HRSpecialist, new HRSpecialistCreator());
        creators.put(Role.BlueCollar, new BlueCollarCreator());
    }

    @Override
    public TeamBuilder add(Role role, int count) {
        if (count < 0) throw new IllegalArgumentException("count must be >= 0");
        
        WorkerCreator creator = creators.get(role);
        if (creator == null) {
            throw new IllegalArgumentException("Unknown role: " + role);
        }
        
        for (int i = 0; i < count; i++) {
            temp.add(creator.create());
        }
        return this;
    }

    @Override
    public Team build() {
        Team t = new Team(temp);
        temp.clear();
        return t;
    }
}
