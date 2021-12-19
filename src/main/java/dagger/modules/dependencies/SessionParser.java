package dagger.modules.dependencies;

import javax.inject.Inject;

public class SessionParser {
    @Inject
    SessionParser(Session session, InnerRequest innerRequest) {
        System.out.println("session parser session: " + session + " and inner request: " + innerRequest);
    }
}
