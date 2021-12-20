package dagger.components;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;
//import dagger.modules.PeriodicModule;
import dagger.modules.RequestModule;
import dagger.modules.SingletonModule;
import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.SingletonDeps;
import dagger.modules.dependencies.handlers.RequestHandler;
import dagger.scopes.PeriodicScope;
import dagger.scopes.RequestScope;

import javax.inject.Singleton;

@Singleton
//@PeriodicScope
@Component(/*modules = SingletonModule.class*/)
public interface SingletonComponent {
    @Singleton
    public SingletonDeps provideSingletonDeps();

    RequestRouter router();

    PeriodicComponent.Builder getPeriodicBuilder();

//    @Singleton
//    public RequestHandler provideRequestHandler();

//    @RequestScope
//    public RequestComponent.RequestScopeFactory requestComponentFactory();

//    @Component.Builder
//    public interface Builder {
//        public SingletonComponent build();
//
//        Builder periodicComponent(@BindsInstance PeriodicComponent periodicComponent);
//    }

//    @PeriodicScope
//    public PeriodicComponent periodicComponent();

//    @Component.Factory
//    public interface PeriodicBuilder {
//        public SingletonComponent build(PeriodicModule periodicModule);
//    }

//    @PeriodicScope
//    public PeriodicComponent periodicComponent(PeriodicModule periodicModule);

//    @RequestScope
//    public Config provideRequestConfig(Config config);

//    @Component.Builder
//    interface Builder {
//        SingletonComponent build();
//        @BindsInstance Builder request(Request request);
//    }
}
