package dev.jx.starwars.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("development")
@Component
public class EnvDevelopment implements Env {

    @Value("${starwars.api.base_url}")
    private String starwarsApiBaseUrl;

    @Override
    public String getStarWarsApiUrl() {
        return starwarsApiBaseUrl;
    }
}
