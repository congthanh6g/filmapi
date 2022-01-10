package com.example.filmapi.Controller;

import com.example.filmapi.Response.BaseResponse;
import com.example.filmapi.Response.DTO.HomeDTO;
import com.example.filmapi.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/getAll")
    private ResponseEntity getHome() {
        BaseResponse<HomeDTO> res = new BaseResponse();
        HomeDTO homeDTO = new HomeDTO(movieService.listTrending() , movieService.listHot() , movieService.listSuggest() , movieService.listWatch());
        res.data = homeDTO;
        return ResponseEntity.ok(res);
    }
}
