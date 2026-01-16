/**
 * Concrete Creator for Frontend Developers
 */
public class FrontendCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new FrontendDeveloper(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "FE";
    }
    
    @Override
    protected String getDefaultName() {
        return "Frontend Developer";
    }
}


