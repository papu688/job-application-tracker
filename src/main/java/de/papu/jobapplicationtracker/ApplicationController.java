package de.papu.jobapplicationtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @GetMapping
    public List<Application> getAll() {
        return List.of(
                new Application(1L, "Zalando", "Werkstudent Backend",
                        LocalDate.of(2026, 10, 15), "APPLIED"),
                new Application(2L, "SAP", "Werkstudent Java",
                        LocalDate.of(2026, 10, 20), "INTERVIEW")
        );
    }
}