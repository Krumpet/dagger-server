package dagger.modules.dependencies.handlers;

import dagger.modules.dependencies.*;
import responses.Response;

import javax.inject.Inject;

public class RequestHandler {
    private static int pid = 0;
    private final SubRequestHandler requestHandler;
    private final SessionParser sessionParser;
    private final PeriodicDependency periodicDependency;
    public int id;
    private final Request request;
    private final SingletonDeps singletonDeps;

    @Inject
    public RequestHandler(Request request, SingletonDeps singletonDeps, SubRequestHandler helper, SessionParser sessionParser, PeriodicDependency periodicDependency) {
        this.requestHandler = helper;
        this.sessionParser = sessionParser;
        this.periodicDependency = periodicDependency;
        id = pid++;
        this.request = request;
        this.singletonDeps = singletonDeps;
        System.out.println("request handler id " + id + " request: " + this.request.id + " singletonDeps: " + singletonDeps.id + " periodic " + periodicDependency.id);
        this.requestHandler.help();
    }

    public Response execute() {
        return new Response();
    }
}
