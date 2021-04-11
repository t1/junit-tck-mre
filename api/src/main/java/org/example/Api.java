package org.example;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public interface Api {
    static Api load() {
        ServiceLoader<Api> loader = ServiceLoader.load(Api.class);
        Iterator<Api> iterator = loader.iterator();
        if (!iterator.hasNext())
            throw new ServiceConfigurationError("no " + Api.class.getName() + " in classpath");
        Api graphQlClientBuilder = iterator.next();
        if (iterator.hasNext())
            throw new ServiceConfigurationError("more than one " + Api.class.getName() + " in classpath");
        return graphQlClientBuilder;
    }

    String foo();
}
