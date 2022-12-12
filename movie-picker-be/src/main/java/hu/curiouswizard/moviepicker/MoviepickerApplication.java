package hu.curiouswizard.moviepicker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hu.curiouswizard.moviepicker.model.Movie;
import hu.curiouswizard.moviepicker.repository.MovieRepository;

@SpringBootApplication
public class MoviepickerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviepickerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(MovieRepository repository) {
		return args -> {
			// add some data
			repository.save(new Movie(null, "The Godfather", 1972, "Crime, Drama"));
		};
	}

}
