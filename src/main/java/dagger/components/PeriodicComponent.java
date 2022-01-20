package dagger.components;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import dagger.components.RequestComponents.AnotherRequestComponent;
import dagger.components.RequestComponents.RoutingRequestComponent;
import dagger.modules.PeriodicModule;
import dagger.modules.dependencies.PeriodicDependency;
import dagger.modules.dependencies.Request;
import dagger.scopes.PeriodicScope;
import dagger.scopes.RequestScope;

@PeriodicScope
@Subcomponent(modules = PeriodicModule.class)
public interface PeriodicComponent {
    public PeriodicDependency providePeriodicDependency();

    public RoutingRequestComponent.Factory provideRoutingRequestComponentFactory();

    public AnotherRequestComponent.Factory provideAnotherRequestComponentFactory();

    @Subcomponent.Builder
    public interface Builder {
        PeriodicComponent build();
    }
}
