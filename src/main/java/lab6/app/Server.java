package lab6.app;

import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

public class Server extends AllDirectives {

    private static final String URL_PARAM_NAME = "url";
    private static final String COUNT_PARAM_NAME = "count";

    public Server() {
        //TODO: add constructor
    }

    public Route createRoute() {
        return get(() -> parameter(URL_PARAM_NAME, url -> parameter(COUNT_PARAM_NAME)));
    }
}