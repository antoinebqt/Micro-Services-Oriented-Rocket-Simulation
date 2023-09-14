package fr.teama.missionservice.controllers;

import fr.teama.missionservice.exceptions.WeatherServiceUnavailableException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = {WeatherServiceUnavailableException.class})
public class GlobalControllerAdvice {

    @ExceptionHandler({WeatherServiceUnavailableException.class})
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public void handleExceptions(WeatherServiceUnavailableException e) {
        System.out.println("Parking unavailable!");
    }
}
