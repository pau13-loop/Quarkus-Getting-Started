package org.acme.quickstart;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class InMemoryConfigSource implements ConfigSource{

    private Map<String, String> prop = new HashMap<>();

    public InMemoryConfigSource() {
        this.prop.put("greetings.message", "Memory Hello");
    }

    // Otorga preferencia de carga a los valores 
    // Contra mayor sea el valor mayor preferencia tendrá 
    @Override
    public int getOrdinal() {
        return 900;
    }

    @Override
    public String getName() {
        return "InMemoryConfigSource";
    }

    // Have to return all loaded properties
    @Override
    public Map<String, String> getProperties() {
        return this.prop;
    }

    // Get values from the Map
    @Override
    public String getValue(String propName) {
        return this.prop.get(propName);
    }
    
}
