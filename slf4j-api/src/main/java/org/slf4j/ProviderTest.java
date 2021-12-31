package org.slf4j;

import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

public class ProviderTest implements SLF4JServiceProvider {
    @Override
    public ILoggerFactory getLoggerFactory() {
        System.out.println("do nothing");
        return null;
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        System.out.println("do nothing");
        return null;
    }

    @Override
    public MDCAdapter getMDCAdapter() {
        System.out.println("do nothing");
        return null;
    }

    @Override
    public String getRequestedApiVersion() {
        System.out.println("do nothing");
        return null;
    }

    @Override
    public void initialize() {
        System.out.println("do nothing");
    }
}
