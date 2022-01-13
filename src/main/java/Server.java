//import dagger.components.DaggerSingletonComponent;

//import dagger.components.DaggerSingletonComponent;
import dagger.components.*;
//import dagger.modules.PeriodicModule;
import dagger.modules.RequestModule;
import dagger.modules.dependencies.*;
import dagger.modules.dependencies.handlers.RequestHandler;
import responses.Response;

import javax.inject.Singleton;

public class Server {

//    private final RequestRouter requestRouter;
    private final RequestRouter notInjected;

    public Server(/*RequestRouter requestRouter*/) {
        notInjected = DaggerSingletonComponent.create().router();
//        this.requestRouter = requestRouter;
    }

//    private void setPeriodicComponent() {
//        PeriodicComponent.Builder = DaggerSingletonComponent.
//        singletonComponentBuilder.periodicComponent()
//    }
//    private final SingletonComponent singletonComponent = DaggerSingletonComponent.factory().build(new PeriodicModule());
//    SingletonComponent.Builder requestContextBuilder = DaggerSingletonComponent.builder();

    public Response handleRequest(Request request) {
        RoutingRequest routingRequest = new RoutingRequest(new RoutingConfig(request.config), new RoutingSession(request.session), request);
        return this.notInjected.handleRequest(routingRequest);
//        return getRequestComponent(request).requestHandler().execute();
//        return DaggerSingletonComponent.builder().;
//        return requestContextBuilder.request(request).build().provideRequestHandler().execute();
    }

    private RequestComponent getRequestComponent(Request request) {
        return null;
//        return singletonComponent.requestComponent(new RequestModule(request));
//        return singletonComponent.requestComponentFactory().getRequestComponent(request, request.config, request.session, request.innerRequest);
    }
}
