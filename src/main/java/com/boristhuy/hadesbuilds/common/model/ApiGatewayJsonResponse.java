package com.boristhuy.hadesbuilds.common.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Getter
public class ApiGatewayJsonResponse<T> {
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";

    private final T body;
    private final Map<String, String> headers;
    private final int statusCode;

    public ApiGatewayJsonResponse(T body, Map<String, String> headers, int statusCode) {
        this.statusCode = statusCode;
        this.body = body;
        this.headers = new HashMap<>();
        this.headers.put(CONTENT_TYPE, CONTENT_TYPE_APPLICATION_JSON);
        this.headers.putAll(headers);
    }

    public static <T> ApiGatewayJsonResponse<T> ok(T body) {
        return new ApiGatewayJsonResponse<>(body, Map.of(), 200);
    }
}
