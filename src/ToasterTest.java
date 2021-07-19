/* * Simulate a toaster with slots, voltage, slices of bread, * and darkness control */package src;
class PowerSupply {
    private int voltage;
    private boolean turnedOn;
    public PowerSupply(int voltage) {
        this.setVoltage(voltage);
        this.turnedOn = false;
    }
    public int getVoltage() {
        return voltage;
    }
    public void setVoltage(int voltage) {
        if (voltage == 110 || voltage == 220) {
            this.voltage = voltage;
        } else {
            this.voltage = 110;
        }
    }
    public boolean getTurnedOn() {
        return turnedOn;
    }
    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
    public void turnOn() {
        setTurnedOn(true);
    }
    public void turnOff() {
        setTurnedOn(false);
    }
}
class Dial {
    private int setting;
    private int minVal;
    private int maxVal;
    public Dial(int setting, int minVal, int maxVal) {
        this.minVal = minVal;
        this.maxVal = maxVal;
        setSetting(setting);
    }
    public int getSetting() {
        return setting;
    }
    public void setSetting(int setting) {
        this.setting = Math.min(maxVal, Math.max(minVal, setting));
    }
    public int getMinVal() {
        return minVal;
    }
    public int getMaxVal() {
        return maxVal;
    }
}
class Toaster {
    private int nSlots;
    private int nSlices;
    private PowerSupply power;
    private Dial darkness;
    public Toaster(int nSlots, int voltage) {
        this.power = new PowerSupply(voltage);
        this.darkness = new Dial(1, 1, 10);
        this.setNSlots(nSlots);
        this.nSlices = 0;
    }
    public PowerSupply getPower() {
        return power;
    }
    public Dial getDarkness() {
        return darkness;
    }
    public int getNSlots() {
        return nSlots;
    }
    public void setNSlots(int nSlots) {
        this.nSlots = Math.max(1, Math.min(4, nSlots));
    }
    public int getNSlices() {
        return nSlices;
    }
    public void setNSlices(int nSlices) {
        this.nSlices = Math.min(nSlots, Math.abs(nSlices));
    }
    public void insertBread(int n) {
        if (power.getTurnedOn()) {
            setNSlices(nSlices + n);
        }
    }
    public void popBread() {
        if (power.getTurnedOn()) {
            setNSlices(0);
        }
    }
    public String toString() {
        return String.format("%d slot %dV toaster with %d slice%s at darkness %d: %s", nSlots, power.getVoltage(), nSlices, ((nSlices == 1) ? "" : "s"), darkness.getSetting(), ((power.getTurnedOn()) ? "ON" : "OFF"));
    }
}
public class ToasterTest {
    public static void main(String[] args) {
        Toaster twoSlot = new Toaster(2, 110);
        Toaster euroFour = new Toaster(4, 220);
        twoSlot.getPower().turnOn();
        twoSlot.getDarkness().setSetting(4);
        twoSlot.insertBread(1);
        System.out.println(twoSlot);
        System.out.println(euroFour);
    }
}