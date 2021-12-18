public class Server {

    public Response handleRequest(Request request) {
        return new RequestHandler(request, new SingletonDeps()).execute();
    }
}
