package dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.InnerRequest;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.Session;
import dagger.scopes.RequestScope;

@Module
public class RequestModule {
    private final Request request;

    public RequestModule(Request request) {
        this.request = request;
    }

    @Provides
    @RequestScope
    public Request providesRequest() {
        return request;
    }

    @Provides
    @RequestScope
    public InnerRequest providesInnerRequest() {
        return request.innerRequest;
    }


    @Provides
    @RequestScope
    public Session providesSession() {
        return request.session;
    }


    @Provides
    @RequestScope
    public Config providesConfig(Request request) {
        return request.config;
    }
}
