package dagger.modules.dependencies;

import dagger.modules.dependencies.Config;
import dagger.modules.dependencies.InnerRequest;
import dagger.modules.dependencies.Session;

public class Request {
    private static int pid = 0;
    public int id;
    public Config config;
    public Session session;
    public InnerRequest innerRequest;

    public Request() {
        id = pid++;
    }
}
