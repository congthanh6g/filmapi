package com.example.filmapi.Response.DTO;

import java.util.List;

public class HomeDTO {
    private List<MovieDTO> ListTrending;
    private List<MovieDTO> ListHot;
    private List<MovieDTO> listSuggest;
    private List<MovieDTO> listWatch;

    public HomeDTO() {
    }

    public HomeDTO(List<MovieDTO> listTrending, List<MovieDTO> listHot, List<MovieDTO> listSuggest, List<MovieDTO> listWatch) {
        ListTrending = listTrending;
        ListHot = listHot;
        this.listSuggest = listSuggest;
        this.listWatch = listWatch;
    }

    public List<MovieDTO> getListTrending() {
        return ListTrending;
    }

    public void setListTrending(List<MovieDTO> listTrending) {
        ListTrending = listTrending;
    }

    public List<MovieDTO> getListHot() {
        return ListHot;
    }

    public void setListHot(List<MovieDTO> listHot) {
        ListHot = listHot;
    }

    public List<MovieDTO> getListSuggest() {
        return listSuggest;
    }

    public void setListSuggest(List<MovieDTO> listSuggest) {
        this.listSuggest = listSuggest;
    }

    public List<MovieDTO> getListWatch() {
        return listWatch;
    }

    public void setListWatch(List<MovieDTO> listWatch) {
        this.listWatch = listWatch;
    }
}
