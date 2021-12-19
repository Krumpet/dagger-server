//import dagger.components.DaggerSingletonComponent;
import dagger.components.DaggerSingletonComponent;
import dagger.components.RequestComponent;
import dagger.components.SingletonComponent;
import dagger.modules.PeriodicModule;
import dagger.modules.RequestModule;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;
import responses.Response;

public class Server {

    private final SingletonComponent singletonComponent = DaggerSingletonComponent.factory().build(new PeriodicModule());
//    SingletonComponent.Builder requestContextBuilder = DaggerSingletonComponent.builder();

    public Response handleRequest(Request request) {
        return getRequestComponent(request).requestHandler().execute();
//        return DaggerSingletonComponent.builder().;
//        return requestContextBuilder.request(request).build().provideRequestHandler().execute();
    }

    private RequestComponent getRequestComponent(Request request) {
//        singletonComponent.
//        return singletonComponent.requestComponent(new RequestModule(request));
        return singletonComponent.requestComponentFactory().getRequestComponent(request, request.config, request.session, request.innerRequest);
    }
}
