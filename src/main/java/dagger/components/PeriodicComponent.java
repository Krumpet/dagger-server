package dagger.components;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import dagger.modules.PeriodicModule;
import dagger.modules.dependencies.PeriodicDependency;
import dagger.modules.dependencies.Request;
import dagger.scopes.PeriodicScope;
import dagger.scopes.RequestScope;

@PeriodicScope
@Subcomponent(modules = PeriodicModule.class)
public interface PeriodicComponent {
    public PeriodicDependency providePeriodicDependency();

    public RequestComponent.Factory provideRequestComponentFactory();

    @Subcomponent.Builder
    public interface Builder {
//        Builder setRequestComponent(@BindsInstance RequestComponent requestComponent);

        PeriodicComponent build();
    }
}
