package org.example.sampleapplicationgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class RoutesConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p->
                        p.path("/get")
                                .filters(f -> f.addRequestHeader("Hello", "World"))
                                .uri("http://httpbin.org:80")
                )
                .build();
    }
}


