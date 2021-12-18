public class RequestHandler {
    private final Request request;
    private final SingletonDeps singletonDeps;

    public RequestHandler(Request request, SingletonDeps singletonDeps) {
        this.request = request;
        this.singletonDeps = singletonDeps;
    }

    public Response execute() {
        return new Response();
    }
}
