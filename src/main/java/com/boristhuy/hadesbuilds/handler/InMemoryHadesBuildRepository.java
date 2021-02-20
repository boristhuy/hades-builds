package com.boristhuy.hadesbuilds.handler;

import java.util.List;

public class InMemoryHadesBuildRepository implements HadesBuildsRepository {

    @Override
    public List<HadesBuild> getAllHadesBuilds() {
        return List.of(
            HadesBuild.builder()
                .name("BROKEN sword hammer combo to get back health infinitely!")
                .build(),
            HadesBuild.builder()
                .name("Zeus dash run got OUT OF CONTROL!")
                .build()
        );
    }
}
