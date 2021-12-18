package dagger.components;

import dagger.BindsInstance;
import dagger.Component;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;

import javax.inject.Singleton;

@Singleton
@Component()
public interface SingletonComponent {
    @Singleton
    public SingletonDeps provideSingletonDeps();

    @Singleton
    public RequestHandler provideRequestHandler();

    @Component.Builder
    interface Builder {
        SingletonComponent build();
        @BindsInstance Builder request(Request request);
    }
}
