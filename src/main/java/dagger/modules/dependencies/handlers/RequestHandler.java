package dagger.modules.dependencies.handlers;

import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import responses.Response;

import javax.inject.Inject;

public class RequestHandler {
    private static int pid = 0;
    public int id;
    private final Request request;
    private final SingletonDeps singletonDeps;

    @Inject
    public RequestHandler(Request request, SingletonDeps singletonDeps) {
        id = pid++;
        this.request = request;
        this.singletonDeps = singletonDeps;
        System.out.println("request handler id " + id + " request: " + this.request.id + " singletonDeps: " + singletonDeps.id);
    }

    public Response execute() {
        return new Response();
    }
}
