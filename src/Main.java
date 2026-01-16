/**
 * Client code demonstrating the use of Factory Method and Builder patterns
 * 
 * This HR system creates teams with different worker types based on client requirements.
 * - Factory Method Pattern: Used to create individual workers (7 types)
 * - Builder Pattern: Used to construct complex Team objects step-by-step
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   HR SYSTEM - TEAM BUILDER DEMO");
        System.out.println("========================================\n");
        
        // Example 1: Software Development Team
        // Client request: 1 architect + 1 technical manager + 2 frontend + 7 backend
        System.out.println(">> Creating Software Development Team...\n");
        
        TeamBuilder builder1 = new FactoryBackedTeamBuilder();
        Team softwareTeam = builder1
                .add(Role.Architect, 1)
                .add(Role.TechnicalManager, 1)
                .add(Role.Frontend, 2)
                .add(Role.Backend, 7)
                .build();
        
        softwareTeam.print();
        
        // Example 2: Operations and HR Team
        // Client request: 1 admin manager + 2 HR specialists + 3 blue collar workers
        System.out.println(">> Creating Operations & HR Team...\n");
        
        TeamBuilder builder2 = new FactoryBackedTeamBuilder();
        Team opsTeam = builder2
                .add(Role.AdministrativeManager, 1)
                .add(Role.HRSpecialist, 2)
                .add(Role.BlueCollar, 3)
                .build();
        
        opsTeam.print();
        
        // Example 3: Full-Stack Development Team
        System.out.println(">> Creating Full-Stack Development Team...\n");
        
        TeamBuilder builder3 = new FactoryBackedTeamBuilder();
        Team fullStackTeam = builder3
                .add(Role.Architect, 2)
                .add(Role.TechnicalManager, 1)
                .add(Role.Frontend, 3)
                .add(Role.Backend, 5)
                .build();
        
        fullStackTeam.print();
        
        System.out.println("========================================");
        System.out.println("   All teams created successfully!");
        System.out.println("========================================");
    }
}
