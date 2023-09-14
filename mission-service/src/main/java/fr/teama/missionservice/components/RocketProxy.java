package fr.teama.missionservice.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RocketProxy {
    @Value("${rocket.api.baseurl}")
    private String rocketHostandPort;

    private RestTemplate restTemplate = new RestTemplate();

    public String getRocketStatus() {
        ResponseEntity<String> response = restTemplate.getForEntity(rocketHostandPort + "/rocket", String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Impossible to fetch rocket data.");
        }
    }
}
