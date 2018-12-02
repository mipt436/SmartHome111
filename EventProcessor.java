public interface EventProcessor {
    void processEvent(SmartHome smartHome, SensorEvent event);
}