package dagger.modules;

import dagger.Module;
import dagger.Provides;
import dagger.modules.dependencies.*;

@Module
public interface RoutingRequestModule {
    @Provides
    static Request getRequest(RoutingRequest request) {
        return request.request;
    }

    @Provides
    static Config getConfig(RoutingRequest request) {
        return request.request.config;
    }

    @Provides
    static Session getSession(RoutingRequest request) {
        return request.request.session;
    }

    @Provides
    static InnerRequest getInnerRequest(RoutingRequest request) {
        return request.request.innerRequest;
    }
}
