package unitb.spring;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyService {

    private ResourceManager resourceManager;


    public MyService(ResourceManager resourceManager){
        this.resourceManager = resourceManager;
    }
    public String getData(String date) {

        return "Hello world!";
    }

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public byte[] getFile(String date) {
        try {
            Date parseDate = DATE_FORMAT.parse(date);
            InputStream is = resourceManager.getResource(date + ".data");
            if (is == null) {
                return null;
            }
            return IOUtils.toByteArray(is);
        } catch (ParseException e){
            return "Please use to right Date format (yyyy-MM-dd)".getBytes();
        } catch(IOException e) {
            return "Error while reading file".getBytes();
        }
    }
}
