package de.papu.jobapplicationtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService service;              // ← 1. das Feld

    public ApplicationController(ApplicationService service) {   // ← 2. der Konstruktor
        this.service = service;                            // ← 3. zuweisen
    }

    @GetMapping
    public List<Application> getAll() {
        return service.findAll();                          // ← 4. benutzen
    }
}