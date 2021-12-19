package dagger.modules.dependencies.handlers;

import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SessionParser;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.SubRequestHandler;
import responses.Response;

import javax.inject.Inject;

public class RequestHandler {
    private static int pid = 0;
    private final SubRequestHandler requestHandler;
    private final SessionParser sessionParser;
    public int id;
    private final Request request;
    private final SingletonDeps singletonDeps;

    @Inject
    public RequestHandler(Request request, SingletonDeps singletonDeps, SubRequestHandler helper, SessionParser sessionParser) {
        this.requestHandler = helper;
        this.sessionParser = sessionParser;
        id = pid++;
        this.request = request;
        this.singletonDeps = singletonDeps;
        System.out.println("request handler id " + id + " request: " + this.request.id + " singletonDeps: " + singletonDeps.id);
        this.requestHandler.help();
    }

    public Response execute() {
        return new Response();
    }
}
