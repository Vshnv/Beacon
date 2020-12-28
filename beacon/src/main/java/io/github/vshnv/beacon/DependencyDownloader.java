package io.github.vshnv.beacon;

import java.io.File;
import java.util.concurrent.CompletableFuture;

public interface DependencyDownloader {
    CompletableFuture<File> download(Dependency dependency);
}
