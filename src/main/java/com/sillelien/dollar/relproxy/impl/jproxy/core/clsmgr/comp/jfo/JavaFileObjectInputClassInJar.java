package com.sillelien.dollar.relproxy.impl.jproxy.core.clsmgr.comp.jfo;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

/**
 * @author jmarranz
 */
public class JavaFileObjectInputClassInJar extends JavaFileObjectInputClassInFileSystem {
    protected long timestamp;

    public JavaFileObjectInputClassInJar(String binaryName, @NotNull URI uri, long timestamp) {
        super(binaryName, uri, uri.getSchemeSpecificPart());
        this.timestamp = timestamp;
    }

    @Override
    public InputStream openInputStream() throws IOException {
        return uri.toURL().openStream(); // easy way to handle any URI!
    }

    @Override
    public long getLastModified() {
        return timestamp;
    }

    @NotNull
    @Override
    public String toString() {
        return "JavaFileObjectInputClassInJar{uri=" + uri + '}';
    }
}
