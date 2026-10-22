package de.papu.jobapplicationtracker;

import java.time.LocalDate;

public record Application(
        Long id,
        String company,
        String position,
        LocalDate appliedOn,
        String status
) {}