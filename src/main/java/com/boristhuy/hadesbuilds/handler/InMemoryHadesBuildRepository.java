package com.boristhuy.hadesbuilds.handler;

import java.util.List;

public class InMemoryHadesBuildRepository implements HadesBuildsRepository {

    @Override
    public List<HadesBuild> getAllHadesBuilds() {
        return List.of();
    }
}
