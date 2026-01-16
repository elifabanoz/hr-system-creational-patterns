/**
 * Concrete Creator for HR Specialists
 */
public class HRSpecialistCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new HRSpecialist(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "HR";
    }
    
    @Override
    protected String getDefaultName() {
        return "HR Specialist";
    }
}


