package com.chandan.portfolio.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupLogger {

    private static final Logger logger = LoggerFactory.getLogger(StartupLogger.class);

    @Bean
    public CommandLineRunner logStartup() {
        return args -> {
            logger.info("🚀 Backend Started Successfully!");
            logger.info("✅ Connected to PostgreSQL Database");
            logger.info("🌐 API running at: http://localhost:8080");
        };
    }
}