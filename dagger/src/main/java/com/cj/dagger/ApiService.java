package com.cj.dagger;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET
    Call getInfo();
}
