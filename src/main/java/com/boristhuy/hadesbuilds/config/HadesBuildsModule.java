package com.boristhuy.hadesbuilds.config;

import com.boristhuy.hadesbuilds.handler.HadesBuildsRepository;
import com.boristhuy.hadesbuilds.handler.InMemoryHadesBuildRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class HadesBuildsModule {

    @Singleton
    @Provides
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Singleton
    @Provides
    HadesBuildsRepository hadesBuildsRepository() {
        return new InMemoryHadesBuildRepository();
    }
}
