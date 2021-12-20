package dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.components.RequestComponent;
import dagger.modules.dependencies.PeriodicDependency;
import dagger.scopes.PeriodicScope;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Module(/*subcomponents = RequestComponent.class*/)
public class PeriodicModule {
//    private static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//    private PeriodicDependency periodicDependency;
//
//    @Provides
//    @PeriodicScope
//    public PeriodicDependency providesPeriodicDependency() {
//        return this.periodicDependency;
//    }
//
//    public PeriodicModule() {
//        scheduledExecutorService.scheduleAtFixedRate(this::refresh, 0, 2, TimeUnit.SECONDS);
//    }
//
//    private void refresh() {
//        this.periodicDependency = new PeriodicDependency();
//    }
}
