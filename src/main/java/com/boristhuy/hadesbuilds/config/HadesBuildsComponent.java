package com.boristhuy.hadesbuilds.config;

import com.boristhuy.hadesbuilds.handler.GetHadesBuildsHandler;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {HadesBuildsModule.class})
public interface HadesBuildsComponent {

    void inject(GetHadesBuildsHandler handler);
}
