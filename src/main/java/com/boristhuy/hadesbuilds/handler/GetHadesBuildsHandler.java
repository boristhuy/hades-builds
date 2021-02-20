package com.boristhuy.hadesbuilds.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.boristhuy.hadesbuilds.config.DaggerHadesBuildsComponent;
import com.boristhuy.hadesbuilds.config.HadesBuildsComponent;
import com.boristhuy.hadesbuilds.common.model.ApiGatewayResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.inject.Inject;

public class GetHadesBuildsHandler implements RequestStreamHandler {

    @Inject
    HadesBuildsRepository hadesBuildsRepository;
    @Inject
    ObjectMapper objectMapper;

    public GetHadesBuildsHandler() {
        HadesBuildsComponent hadesBuildsComponent = DaggerHadesBuildsComponent.builder().build();
        hadesBuildsComponent.inject(this);
    }

    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

    }
}
