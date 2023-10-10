package fr.teama.missionservice.interfaces;

import fr.teama.missionservice.exceptions.*;
import org.springframework.http.ResponseEntity;

public interface IMissionManager {
    ResponseEntity<String> startMission() throws RocketServiceUnavailableException, WeatherServiceUnavailableException, RocketHardwareServiceUnavailableException, PayloadServiceUnavailableException, ExecutiveServiceUnavailableException, TelemetryServiceUnavailableException, WebcasterServiceUnavailableException;
    void missionFailed() throws RocketHardwareServiceUnavailableException, LogsServiceUnavailableException;
    void missionSuccess() throws RocketHardwareServiceUnavailableException, LogsServiceUnavailableException, WebcasterServiceUnavailableException;
}
