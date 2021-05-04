package cst438assignment1;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieRatingsController {

	@Autowired
	MovieRatingsRepository ratingsRepository;
	
	@GetMapping("/movies/new")
		public String createRating(Model model) {
		MovieRating rating  = new MovieRating();
		model.addAttribute("rating", rating);
		return "movie_rating_form";
	}
	
	@PostMapping("/movies")
		public String processRatingForm(@Valid MovieRating rating,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "movie_rating_form";
		}
		ratingsRepository.save(rating);
		return "show_rating";	
	}
	
	@GetMapping("/movies")
	public String getAllRatings(Model model) {
		Iterable<MovieRating> ratings = 
				ratingsRepository.findAllMovieRatingsOrderByTitleDateDesc();
		model.addAttribute("ratings", ratings);
		return "ratings_list";
	}
	
}
