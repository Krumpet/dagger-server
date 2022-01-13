package dagger.components.RequestComponents;

import dagger.BindsInstance;
import dagger.Subcomponent;
import dagger.modules.dependencies.*;
import dagger.scopes.RequestScope;

@RequestScope
@Subcomponent
public abstract class RoutingRequestComponent implements BaseRequestComponent<RoutingConfig, RoutingSession, RoutingRequest> {
    @Override
    public RoutingConfig getRConfig() {
        return null;
    }

    @Override
    public RoutingSession getRSession() {
        return null;
    }

    @Override
    public RoutingRequest getRRequest() {
        return null;
    }

    @Override
    public Config getConfig(RoutingConfig routingConfig) {
        return routingConfig.config;
    }

    @Override
    public Session getSession(RoutingSession routingSession) {
        return routingSession.session;
    }

    @Override
    public Request getRequest(RoutingRequest routingRequest) {
        return routingRequest.request;
    }

    @Subcomponent.Factory
    public interface Factory {
        public RoutingRequestComponent build(@BindsInstance RoutingRequest request, @BindsInstance RoutingConfig routingConfig, @BindsInstance RoutingSession routingSession);
    }
}
