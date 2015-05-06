package example.ppch.value.consumer;

import java.util.Properties;

public class PropertyConsumer {
    private Properties properties;

    public void init() {
        System.out.println( "My properties: " + this.properties );
    }

    public void setProperties(Properties oProperties) {
        this.properties = oProperties;
    }

}
