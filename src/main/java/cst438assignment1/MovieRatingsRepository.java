package cst438assignment1;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRatingsRepository extends CrudRepository<MovieRating, Long> {
	@Query("select m from MovieRating m order by title desc")
	List<MovieRating>findAllMovieRatingsOrderByTitleDateDesc();	
}
