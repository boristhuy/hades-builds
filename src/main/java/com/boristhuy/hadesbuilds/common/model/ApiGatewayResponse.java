package com.boristhuy.hadesbuilds.common.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import java.util.Map;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class ApiGatewayResponse<T> {
    private final T body;
    private final Map<String, String> headers;
    private final int statusCode;

    public ApiGatewayResponse(T body, Map<String, String> headers, int statusCode) {
        this.statusCode = statusCode;
        this.body = body;
        this.headers = Map.copyOf(headers);
    }

    public T getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
