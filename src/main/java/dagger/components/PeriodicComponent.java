package dagger.components;

import dagger.Component;
import dagger.Subcomponent;
import dagger.modules.PeriodicModule;
import dagger.modules.dependencies.PeriodicDependency;
import dagger.scopes.PeriodicScope;

@PeriodicScope
@Subcomponent(modules = PeriodicModule.class)
public interface PeriodicComponent {
    public PeriodicDependency providePeriodicDependency();
}
