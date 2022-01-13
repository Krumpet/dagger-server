package dagger.components.RequestComponents;

import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.Session;

public interface BaseRequestComponent<RConfig, RSession, RRequest> {
    public RConfig getRConfig();

    public RSession getRSession();

    public RRequest getRRequest();

    public Config getConfig(RConfig rConfig);

    public Session getSession(RSession rSession);

    public Request getRequest(RRequest rRequest);
}
