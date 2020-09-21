package services;

import api.model.Shorten;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ShortenService extends MethodsService {

    public static Response post(String jsonName) {
        return post(jsonName, Shorten.class);
    }

}
