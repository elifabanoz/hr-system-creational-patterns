/**
 * Concrete Creator for Technical Managers
 */
public class TechnicalManagerCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new TechnicalManager(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "TM";
    }
    
    @Override
    protected String getDefaultName() {
        return "Technical Manager";
    }
}

