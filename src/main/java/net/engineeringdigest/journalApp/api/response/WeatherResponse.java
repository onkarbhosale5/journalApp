package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {
//    private Request request;
//    private Location location;
    private Current current;

//    public class AirQuality{
//        private String co;
//        private String no2;
//        private String o3;
//        private String so2;
//        @JsonProperty("pm2_5")
//        private String pm25;
//        private String pm10;
//        @JsonProperty("us-epa-index")
//        private String usEpaIndex;
//        @JsonProperty("gb-defra-index")
//        private String gbDefraIndex;
//    }

//    public class Astro{
//        private String sunrise;
//        private String sunset;
//        private String moonrise;
//        private String moonset;
//        @JsonProperty("moonPhase")
//        private String moon_phase;
//        @JsonProperty("moonIllumination")
//        private int moon_illumination;
//    }

    @Getter
    @Setter
    public class Current{
//        @JsonProperty("observation_time")
//        private String observationTime;
        private int temperature;
//        @JsonProperty("weatherCode")
//        private int weather_code;
//        @JsonProperty("weatherIcons")
//        private ArrayList<String> weather_icons;
        @JsonProperty("weatherDescriptions")
        private List<String> weather_descriptions;
//        private Astro astro;
//        @JsonProperty("airQuality")
//        private AirQuality air_quality;
//        @JsonProperty("windSpeed")
//        private int wind_speed;
//        @JsonProperty("windDegree")
//        private int wind_degree;
//        @JsonProperty("windDir")
//        private String wind_dir;
//        private int pressure;
//        private int precip;
//        private int humidity;
//        private int cloudcover;
        private int feelslike;
//        @JsonProperty("uvIndex")
//        private int uv_index;
//        private int visibility;
//        @JsonProperty("isDay")
//        private String is_day;
    }

//    public class Location{
//        private String name;
//        private String country;
//        private String region;
//        private String lat;
//        private String lon;
//        @JsonProperty("timezone_id")
//        private String timezoneId;
//        private String localtime;
//        @JsonProperty("localtimeEpoch")
//        private int localtime_epoch;
//        @JsonProperty("utc_offset")
//        private String utcOffset;
//    }

//    public class Request{
//        private String type;
//        private String query;
//        private String language;
//        private String unit;
//    }
}