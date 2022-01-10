package com.example.filmapi.Service;

import com.example.filmapi.Model.MovieEntity;
import com.example.filmapi.Response.DTO.MovieDTO;

import java.util.List;

public interface MovieService {
    List<MovieDTO> listTrending();
    List<MovieDTO> listHot();
    List<MovieDTO> listSuggest();
    List<MovieDTO> listWatch();
}
