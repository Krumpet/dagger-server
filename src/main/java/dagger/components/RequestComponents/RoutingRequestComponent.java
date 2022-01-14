package dagger.components.RequestComponents;

import dagger.BindsInstance;
import dagger.Subcomponent;
import dagger.modules.RoutingRequestModule;
import dagger.modules.dependencies.*;
import dagger.modules.dependencies.handlers.RequestHandler;
import dagger.scopes.RequestScope;

@RequestScope
@Subcomponent(modules = RoutingRequestModule.class)
public interface RoutingRequestComponent extends BaseRequestComponent<RoutingRequest> {
    @Override
    public RoutingRequest getRRequest();

    public RequestHandler getRequestHandler();

    @Subcomponent.Factory
    public interface Factory {
        public RoutingRequestComponent build(@BindsInstance RoutingRequest request);
    }
}
