import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {
    @Test
    public void whenServerHandlesRequestThenItReturnsAResponse() {
        Server server = new Server();
        Request request = getRequest();
        Response response = server.handleRequest(request);
        Assertions.assertNotNull(response);
    }

    @Test
    public void whenServerHandlesRequestThenItDoesNotThrow() {
        Server server = new Server();
        Request request = getRequest();
        Assertions.assertDoesNotThrow(() -> server.handleRequest(request));
    }

    private Request getRequest() {
        Request request = new Request();
        request.innerRequest = new InnerRequest();
        request.config = new Config();
        request.session = new Session();
        return request;
    }
}