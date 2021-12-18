package dagger.components;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;
import dagger.modules.RequestModule;
import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;
import dagger.scopes.RequestScope;

import javax.inject.Singleton;

@Singleton
@Component(/*modules = RequestModule.class*/)
public interface SingletonComponent {
    @Singleton
    public SingletonDeps provideSingletonDeps();

//    @Singleton
//    public RequestHandler provideRequestHandler();

    @RequestScope
    public RequestComponent requestComponent(RequestModule module);

//    @RequestScope
//    public Config provideRequestConfig(Config config);

//    @Component.Builder
//    interface Builder {
//        SingletonComponent build();
//        @BindsInstance Builder request(Request request);
//    }
}
