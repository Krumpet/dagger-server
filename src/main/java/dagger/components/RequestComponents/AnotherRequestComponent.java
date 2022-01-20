package dagger.components.RequestComponents;

import dagger.BindsInstance;
import dagger.Subcomponent;
import dagger.modules.RoutingRequestModule;
import dagger.modules.dependencies.RoutingRequest;
import dagger.modules.dependencies.handlers.RequestHandler;
import dagger.scopes.RequestScope;

@RequestScope
@Subcomponent(modules = RoutingRequestModule.class)
public interface AnotherRequestComponent extends BaseRequestComponent<RoutingRequest> {
    @Override
    public RoutingRequest getRRequest();

    public RequestHandler getRequestHandler();

    @Subcomponent.Factory
    public interface Factory {
        public AnotherRequestComponent build(@BindsInstance RoutingRequest request);
    }
}
