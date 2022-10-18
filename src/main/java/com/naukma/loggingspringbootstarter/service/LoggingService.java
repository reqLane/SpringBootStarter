package com.naukma.loggingspringbootstarter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface LoggingService {
    Logger logger = LoggerFactory.getLogger(LoggingService.class);

    void log(String message);
}
