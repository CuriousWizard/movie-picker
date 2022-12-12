package hu.curiouswizard.moviepicker.repository;

import hu.curiouswizard.moviepicker.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
    
}
