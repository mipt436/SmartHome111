package ru.sbt.mipt.oop;

public class AlarmModeAlarmState implements AlarmState {
    private Alarm alarm;
    private String password;

    AlarmModeAlarmState(Alarm alarm, String password) {
        this.alarm = alarm;
        this.password = password;
    }

    @Override
    public void activate(String password) {

    }

    @Override
    public void deactivate(String password) {
        if (this.password.equals(password)) {
            alarm.changeAlarmState(new DeactivatedAlarmState(alarm));
        } else {
            alarm.changeAlarmState(new AlarmModeAlarmState(alarm, this.password));
            alarm.setAlarmMode();
        }
    }

    @Override
    public void setAlarmMode() {
        System.out.println("ALARM!");
    }
}
