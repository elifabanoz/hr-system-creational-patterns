/**
 * Factory Method Pattern - Creator (Abstract Class)
 * 
 * Defines the factory method that subclasses must implement
 * to create specific types of workers.
 */
public abstract class WorkerCreator {
    private static IdSeq idSeq = new IdSeq("WRK");
    
    /**
     * Factory Method - must be implemented by concrete creators
     * @param id Unique identifier for the worker
     * @param name Name of the worker
     * @return A concrete Worker instance
     */
    public abstract Worker createWorker(String id, String name);
    
    /**
     * Template method that controls the worker creation process
     * @return A fully initialized Worker
     */
    public Worker create() {
        String id = generateId();
        String name = generateName();
        return createWorker(id, name);
    }
    
    protected abstract String getRolePrefix();
    protected abstract String getDefaultName();
    
    private String generateId() {
        return idSeq.next(getRolePrefix());
    }
    
    private String generateName() {
        return getDefaultName();
    }
}


