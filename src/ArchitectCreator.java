/**
 * Concrete Creator for Software Architects
 */
public class ArchitectCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new SoftwareArchitect(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "ARC";
    }
    
    @Override
    protected String getDefaultName() {
        return "Software Architect";
    }
}


