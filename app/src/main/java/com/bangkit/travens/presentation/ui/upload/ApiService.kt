package com.bangkit.travens.presentation.ui.upload

import com.google.gson.annotations.SerializedName
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit

data class FileUploadResponse(
    @field:SerializedName("image_url")
    val image_url: String,
    @field:SerializedName("label")
    val label: String
)

data class DestinationResponse(
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("destination_name")
    val destination_name: String,
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("address")
    val address: String,
    @field:SerializedName("phone_number")
    val phone_number: String,
    @field:SerializedName("latitude")
    val latitude: String,
    @field:SerializedName("longitude")
    val longitude: String,
    @field:SerializedName("operational_time")
    val operational_time: String
)

class Destination: ArrayList<DestinationResponse>()

interface ApiService {
    @Multipart
    @POST("/predict")
    fun uploadImage(
        @Part file: MultipartBody.Part,
    ): Call<FileUploadResponse>

    @GET("/destinations")
    fun getDestination(
        @Query("destination_name") destination_name: String
    ): Call<Destination>
}

class ApiConfig {
    fun getApiService(): ApiService {
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://travens-api.my.id/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        return retrofit.create(ApiService::class.java)
    }

    fun getDestinationService(): ApiService {
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://travens-api.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        return retrofit.create(ApiService::class.java)
    }
}
