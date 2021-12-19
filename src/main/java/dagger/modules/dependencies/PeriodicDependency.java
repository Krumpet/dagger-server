package dagger.modules.dependencies;

public class PeriodicDependency {
    private static int sid = 0;
    public final int id;

    public PeriodicDependency() {
        id = sid++;
        System.out.println("periodic dep id: " + id);
    }
}
