import java.io.IOException;

public interface SmartHomeSaver {
    void saveSmartHome(SmartHome smartHome) throws IOException;
    void saveSmartHome(SmartHome smartHome, String path) throws IOException;
}