package io.github.vshnv.beacon;

import java.util.Set;

public class Beacon {
    private final Set<Repository> repositories;
    private final Set<Dependency> dependencies;

    private Beacon(Set<Repository> repositories, Set<Dependency> dependencies) {
        this.repositories = repositories;
        this.dependencies = dependencies;
    }

    public boolean loadDependencies() {
        return false;
    }
}
