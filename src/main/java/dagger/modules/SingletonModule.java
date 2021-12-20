package dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.components.PeriodicComponent;
import dagger.modules.dependencies.SingletonDeps;

import javax.inject.Singleton;

@Module(subcomponents = PeriodicComponent.class)
public class SingletonModule {
//    @Provides
//    @Singleton
//    public SingletonDeps provideSingletonDeps() {
//        return new SingletonDeps();
//    }
}
