package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shorten {

    @JsonProperty("result_url")
    private String result_url;

    @JsonProperty("error")
    private String error;


    public String getResult_url() {
        return result_url;
    }

    public void setResult_url(String result_url) {
        this.result_url = result_url;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
