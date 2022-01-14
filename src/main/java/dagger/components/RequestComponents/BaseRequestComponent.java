package dagger.components.RequestComponents;

import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.Request;
import dagger.modules.dependencies.Session;

public interface BaseRequestComponent<RRequest> {

    public RRequest getRRequest();
}
