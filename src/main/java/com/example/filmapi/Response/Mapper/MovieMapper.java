package com.example.filmapi.Response.Mapper;

import com.example.filmapi.Model.*;
import com.example.filmapi.Response.DTO.*;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MovieMapper {
    CastDTO ConvertToDTO(CastEntity castEntity);
    CastEntity ConvertToEntity(CastDTO castDTO);

    CategoryDTO ConvertToDTO(CategoryEntity categoryEntity);
    CategoryEntity ConvertToEntity(CategoryDTO categoryDTO);

    DirectorDTO ConvertToDTO(DirectorEntity directorEntity);
    DirectorEntity ConvertToEntity(DirectorDTO directorDTO);

    MovieDTO ConvertToDTO(MovieEntity movieEntity);
    MovieEntity ConvertToEntity(MovieDTO movieDTO);

}
