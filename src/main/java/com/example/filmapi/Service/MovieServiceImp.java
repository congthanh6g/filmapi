package com.example.filmapi.Service;

import com.example.filmapi.Model.MovieEntity;
import com.example.filmapi.Repository.MovieRepo;
import com.example.filmapi.Response.DTO.MovieDTO;
import com.example.filmapi.Response.Mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    MovieRepo movieRepo;


    @Override
    public List<MovieDTO> listTrending() {
        List<MovieEntity> listMovie = movieRepo.findAll();
        List<MovieDTO> listMovieDto = new ArrayList<>();
        for (MovieEntity p  :  listMovie)
        {
            MovieDTO movieDTO = movieMapper.ConvertToDTO(p);
            listMovieDto.add(movieDTO);
        }
        return listMovieDto;
    }

    @Override
    public List<MovieDTO> listHot() {
        List<MovieEntity> listMovie = movieRepo.findAll();
        List<MovieDTO> listMovieDto = new ArrayList<>();
        for (MovieEntity p  :  listMovie)
        {
            MovieDTO movieDTO = movieMapper.ConvertToDTO(p);
            listMovieDto.add(movieDTO);
        }
        return listMovieDto;
    }

    @Override
    public List<MovieDTO> listSuggest() {
        List<MovieEntity> listMovie = movieRepo.findAll();
        List<MovieDTO> listMovieDto = new ArrayList<>();
        for (MovieEntity p  :  listMovie)
        {
            MovieDTO movieDTO = movieMapper.ConvertToDTO(p);
            listMovieDto.add(movieDTO);
        }
        return listMovieDto;
    }

    @Override
    public List<MovieDTO> listWatch() {
        List<MovieEntity> listMovie = movieRepo.findAll();
        List<MovieDTO> listMovieDto = new ArrayList<>();
        for (MovieEntity p  :  listMovie)
        {
            MovieDTO movieDTO = movieMapper.ConvertToDTO(p);
            listMovieDto.add(movieDTO);
        }
        return listMovieDto;
    }
}
