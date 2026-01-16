/**
 * Concrete Creator for Blue Collar Workers
 */
public class BlueCollarCreator extends WorkerCreator {
    
    @Override
    public Worker createWorker(String id, String name) {
        return new BlueCollarWorker(id, name);
    }
    
    @Override
    protected String getRolePrefix() {
        return "BC";
    }
    
    @Override
    protected String getDefaultName() {
        return "Blue Collar Worker";
    }
}


