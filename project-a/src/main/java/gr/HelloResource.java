package gr;

import io.quarkus.qute.Engine;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    Engine engine;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return engine.getTemplate("root.html").render();
    }
}
