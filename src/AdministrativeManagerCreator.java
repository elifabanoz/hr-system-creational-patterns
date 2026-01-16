/**
 * Concrete Creator for Administrative Managers
 */
public class AdministrativeManagerCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new AdministrativeManager(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "AM";
    }
    
    @Override
    protected String getDefaultName() {
        return "Administrative Manager";
    }
}


