package com.example.filmapi.Response;

import java.util.List;

public class BaseResponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
    public List<T> datas;
}
