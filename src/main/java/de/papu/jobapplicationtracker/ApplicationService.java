package de.papu.jobapplicationtracker;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ApplicationService {

    public List<Application> findAll() {
        return List.of(
                new Application(1L, "Zalando", "Werkstudent Backend",
                        LocalDate.of(2026, 10, 15), "APPLIED"),
                new Application(2L, "SAP", "Werkstudent Java",
                        LocalDate.of(2026, 10, 20), "INTERVIEW")
        );
    }
}