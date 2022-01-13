package dagger.components;

import dagger.components.RequestComponents.RoutingRequestComponent;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.RoutingRequest;
import responses.Response;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Singleton
public class RequestRouter {
//    private RequestComponent.Factory factory;

    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private RoutingRequestComponent.Factory factory;
    //    private final RequestComponent.Factory factory;

    @Inject
    RequestRouter(SingletonComponent singletonComponent) {
//        this.factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
        this.factory = singletonComponent.getPeriodicBuilder().build().provideRoutingRequestComponentFactory();
        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            this.factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
            this.factory = singletonComponent.getPeriodicBuilder().build().provideRoutingRequestComponentFactory();
        }, 0, 2, TimeUnit.SECONDS);
//        factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
    }

    public Response handleRequest(RoutingRequest request) {
        return factory.build(request).getRequestHandler().execute();
//        return factory.getRequestComponent(request, request.config, request.session, request.innerRequest).requestHandler().execute();
//        return null;
//        return factory.getRequestComponent(request, request.config, request.session, request.innerRequest).requestHandler().execute();
    }
}
