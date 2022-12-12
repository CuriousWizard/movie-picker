package hu.curiouswizard.moviepicker.model;

import jakarta.persistence.Id;

public record Movie(@Id Integer id, String title, Integer year, String genre) {
}
