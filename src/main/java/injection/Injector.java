package injection;

import annotations.AutoInjectable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Class which is implementing dependency injection based on a given annotation
 * @author Nikita Safonov, student of AMM VSU, 3rd year, 3rd group
 * @see InjectableTemplate
 * @see AutoInjectable
 */
public class Injector {

    /** File that stores information about the properties of injected dependencies */
    private File data;

    /** Constructor with parameters for an object of the Injector class */
    public Injector(String filePath) {
        this.data = new File(filePath);
    }

    /**
     * Main dependency injection method
     * @param obj object
     * @param <T> object class
     * @return new instance of initial object with injected dependencies, cast to its class
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public <T> T inject (T obj) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileReader(data));

        Class objClass = obj.getClass();
        Object newInstance = objClass.newInstance();
        Field[] fields = objClass.getDeclaredFields();
        for (Field f: fields) {
            Annotation a = f.getAnnotation(AutoInjectable.class);
            f.setAccessible(true);
            if (a != null)
                if (f.getName().equals("field1"))
                    f.set(newInstance, Class.forName(properties.getProperty("interfaces.FirstInterface")).newInstance());
                else if (f.getName().equals("field2"))
                    f.set(newInstance, Class.forName(properties.getProperty("interfaces.SecondInterface")).newInstance());
        }

        return (T) newInstance;
    }

}
