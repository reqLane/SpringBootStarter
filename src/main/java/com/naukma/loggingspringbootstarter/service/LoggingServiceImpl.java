package com.naukma.loggingspringbootstarter.service;

public class LoggingServiceImpl implements LoggingService {

    @Override
    public void log(String message) {
        logger.info(message);
    }
}
