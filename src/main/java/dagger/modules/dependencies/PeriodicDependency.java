package dagger.modules.dependencies;

import dagger.scopes.PeriodicScope;

import javax.inject.Inject;

@PeriodicScope
public class PeriodicDependency {
    private static int sid = 0;
    public final int id;

    @Inject
    public PeriodicDependency() {
        id = sid++;
        System.out.println("periodic dep id: " + id);
    }
}
