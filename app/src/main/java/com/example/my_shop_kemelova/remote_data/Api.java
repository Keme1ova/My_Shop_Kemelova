package com.example.my_shop_kemelova.remote_data;

import com.bumptech.glide.load.model.Model;
import com.example.my_shop_kemelova.models.ModelM;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("products")
    Call<List<ModelM>> getStoreProducts();
}
