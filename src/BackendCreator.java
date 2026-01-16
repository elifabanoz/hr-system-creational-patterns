/**
 * Concrete Creator for Backend Developers
 */
public class BackendCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new BackendDeveloper(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "BE";
    }
    
    @Override
    protected String getDefaultName() {
        return "Backend Developer";
    }
}


