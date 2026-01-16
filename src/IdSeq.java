import java.util.*;

public final class IdSeq {
    private final String familyPrefix;
    private final Map<String, Integer> counters = new HashMap<>();

    public IdSeq(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    public synchronized String next(String rolePrefix) {
        int n = counters.getOrDefault(rolePrefix, 0) + 1;
        counters.put(rolePrefix, n);
        return String.format("%s-%s-%04d", familyPrefix, rolePrefix, n);
    }
}
