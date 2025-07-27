package quispe.movieLocation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import quispe.movieLocation.model.MovieLocation;

@Service
public class MovieLocationService {

	@Autowired
	private WebClient webClient;

	public List<MovieLocation> getAllMovies() {
		return webClient
				.get()
				.retrieve()
				.bodyToFlux(MovieLocation.class)
				.collectList()
				.block();
	}

	public List<MovieLocation> filterByTitle(String query) {
		return getAllMovies()
				.stream()
				.filter(m -> m != null && m.title().toLowerCase().contains(query.toLowerCase()))
				.collect(Collectors.toList());
	}
}
