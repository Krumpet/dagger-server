//import dagger.components.DaggerSingletonComponent;
import dagger.components.DaggerSingletonComponent;
import dagger.components.RequestComponent;
import dagger.components.SingletonComponent;
import dagger.modules.RequestModule;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;
import responses.Response;

public class Server {

    private final SingletonComponent singletonComponent = DaggerSingletonComponent.create();
//    SingletonComponent.Builder requestContextBuilder = DaggerSingletonComponent.builder();

    public Response handleRequest(Request request) {
        return getRequestComponent(request).requestHandler().execute();
//        return null;
//        return DaggerSingletonComponent.builder().;
//        return requestContextBuilder.request(request).build().provideRequestHandler().execute();
    }

    private RequestComponent getRequestComponent(Request request) {
        return singletonComponent.requestComponent(new RequestModule(request));
    }
}
