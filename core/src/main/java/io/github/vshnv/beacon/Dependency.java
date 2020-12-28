package io.github.vshnv.beacon;


import java.io.File;
import java.util.Set;

public final class Dependency {
    private static final File DEFAULT_LOCATION = new File("/.beacon");

    private final String groupId;
    private final String artifactId;
    private final String version;
    private final Repository repository;

    private final File location;

    public Dependency(String groupId, String artifactId, String version, Repository repository, File location) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.repository = repository;
        this.location = location;
    }


    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public Repository getRepository() {
        return repository;
    }

    public File getLocation() {
        return location;
    }

}
