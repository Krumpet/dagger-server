package dagger.modules.dependencies;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SingletonDeps {
    private static int pid = 0;
    public int id;

    @Inject
    public SingletonDeps() {
        id = pid++;
        System.out.println("singleton deps id " + id);
    }
}
