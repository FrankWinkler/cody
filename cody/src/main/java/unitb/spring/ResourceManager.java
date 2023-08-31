package unitb.spring;

import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class ResourceManager {

    public InputStream getResource(String filename) {
        return ResourceManager.class.getResourceAsStream("/" + filename);
    }

}
