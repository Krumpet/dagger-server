package dagger.modules.dependencies;

import javax.inject.Inject;

public class SubRequestHandler {
    private final Config config;

    @Inject
    SubRequestHandler(Config config) {
        this.config = config;
    }

    public void help() {
     System.out.println("helper helping with config: " + config);
    }
}
