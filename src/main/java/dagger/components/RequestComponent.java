package dagger.components;

import dagger.Component;
import dagger.Subcomponent;
import dagger.modules.RequestModule;
import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.InnerRequest;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.Session;
import dagger.modules.dependencies.handlers.RequestHandler;
import dagger.scopes.RequestScope;

@RequestScope
@Subcomponent(modules = RequestModule.class)
public interface RequestComponent {
    public Request provideRequest();

    public InnerRequest provideInnerRequest();

    public Config provideConfig();

    public Session provideSession();

    public RequestHandler requestHandler();
}