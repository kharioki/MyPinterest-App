package com.example.kharioki.mypinterest;

import android.content.Context;

/**
 * Created by peter on 1/31/17.
 */
public class APIUtils {

    public static <T> T getPascoService(Context context, final Class<T> clazz) {
        T service = RetrofitClient.getClient(context, Constants.BASE_URL).create(clazz);
        return service;
    }
}
