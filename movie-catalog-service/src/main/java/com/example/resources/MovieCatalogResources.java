package com.example.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.models.CatalogItem;
import com.example.models.Movie;
import com.example.models.UserRating;

@RestController
@RequestMapping("/catlog")
public class MovieCatalogResources {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + userId,
				UserRating.class);

		return ratings.getUserrating().stream().map(rating -> {
			// for each movie id, call movie info service and get details
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);

			// put them all together
			return new CatalogItem(movie.getName(), "Desc", rating.getRating());
		}).collect(Collectors.toList());

	}

}

//Movie movie =webClientBuilder.build()
//.get()
//.uri("http://localhost:8082/movies/"+rating.getMovieId())
//.retrieve()
//.bodyToMono(Movie.class)
//.block();
