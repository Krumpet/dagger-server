package dagger.modules.dependencies;

public class RoutingRequest {
    public final RoutingConfig routingConfig;
    public final RoutingSession routingSession;
    public final Request request;

    public RoutingRequest(RoutingConfig routingConfig, RoutingSession routingSession, Request request) {
        this.routingConfig = routingConfig;
        this.routingSession = routingSession;
        this.request = request;
    }
}
