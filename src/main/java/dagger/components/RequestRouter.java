package dagger.components;

import dagger.modules.dependencies.Request;
import responses.Response;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Singleton
public class RequestRouter {
    private RequestComponent.Factory factory;
    private static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    //    private final RequestComponent.Factory factory;

    @Inject
    RequestRouter(SingletonComponent singletonComponent) {
        this.factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            this.factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
        }, 0, 2, TimeUnit.SECONDS);
//        factory = singletonComponent.getPeriodicBuilder().build().provideRequestComponentFactory();
    }

    public Response handleRequest(Request request) {
        return factory.getRequestComponent(request, request.config, request.session, request.innerRequest).requestHandler().execute();
//        return null;
//        return factory.getRequestComponent(request, request.config, request.session, request.innerRequest).requestHandler().execute();
    }
}
