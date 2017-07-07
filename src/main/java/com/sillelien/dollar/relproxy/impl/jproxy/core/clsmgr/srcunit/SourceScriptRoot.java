package com.sillelien.dollar.relproxy.impl.jproxy.core.clsmgr.srcunit;

/**
 * @author jmarranz
 */
public abstract class SourceScriptRoot extends SourceUnit {
    public SourceScriptRoot(String className) {
        super(className);
    }

    public abstract String getScriptCode(String encoding, boolean[] hasHashBang);
}
