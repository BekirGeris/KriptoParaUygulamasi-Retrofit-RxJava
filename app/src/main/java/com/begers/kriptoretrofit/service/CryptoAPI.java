package com.begers.kriptoretrofit.service;

import com.begers.kriptoretrofit.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=eaaf35b443ed77522c3c114d37a6744c889827eb")
    Observable<List<CryptoModel>> getData();

    /*Call
    @GET("prices?key=eaaf35b443ed77522c3c114d37a6744c889827eb")
    Call<List<CryptoModel>> getData();
     */
}
