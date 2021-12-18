import dagger.components.DaggerSingletonComponent;
import dagger.components.SingletonComponent;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;
import responses.Response;

public class Server {

    SingletonComponent.Builder requestContextBuilder = DaggerSingletonComponent.builder();

    public Response handleRequest(Request request) {
        return requestContextBuilder.request(request).build().provideRequestHandler().execute();
    }
}
