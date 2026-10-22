package br.com.erudio.controllers;

import br.com.erudio.services.PersonServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;


@RestController
public class TestLogController {

    private final Logger logger = getLogger(PersonServices.class.getName());

    @GetMapping("/test")
    public String testLog() {
        logger.debug("this is an debug Log");
        logger.warn("this is an warn Log");
        logger.info("this is an Info Log");
        logger.error("this is an error Log");

        return "Logs generated successfully!";
    }
}
