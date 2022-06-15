package cn.xuanxuanvi.myapplication.tool;

import cn.xuanxuanvi.myapplication.entity.weather.WeatherJson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiDatas {
    @GET("weather")
    Call<WeatherJson> getWeatherList(@Query("city") String city, @Query("key") String key);
}
