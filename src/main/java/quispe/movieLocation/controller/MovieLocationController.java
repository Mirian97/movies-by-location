package quispe.movieLocation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import quispe.movieLocation.model.MovieLocation;
import quispe.movieLocation.service.MovieLocationService;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movie Location Controller")
public class MovieLocationController {

	@Autowired
	private MovieLocationService service;

	@GetMapping
	@ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
	public ResponseEntity<List<MovieLocation>> getAll(@RequestParam Optional<String> title) {
		return ResponseEntity.ok(
				title.map(service::filterByTitle)
						.orElseGet(service::getAllMovies));
	}
}
