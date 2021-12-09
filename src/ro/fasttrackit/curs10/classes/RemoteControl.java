package ro.fasttrackit.curs10.classes;

public class RemoteControl {
    private int buttons;
    private boolean hasBatteries;

    public RemoteControl (int buttons, boolean hasBatteries) {
        this.buttons = buttons;
        this.hasBatteries = hasBatteries;
    }
    public int getButtons() {
        return this.buttons;
    }
    public boolean isHasBatteries() {
        return this.hasBatteries;
    }
}
