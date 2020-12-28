package io.github.vshnv.beacon;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Repository {
    @Nullable
    private final String alias;
    @NotNull
    private final String baseURL;

    public Repository(@NotNull String baseURL) {
        this(null, baseURL);
    }

    public Repository(@Nullable String alias, @NotNull String baseURL) {
        this.alias = alias;
        this.baseURL = baseURL;
    }

    @NotNull
    public String getBaseURL() {
        return baseURL;
    }

    @Nullable
    public String getAlias() {
        return alias;
    }
}