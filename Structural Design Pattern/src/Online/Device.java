package Online;

public abstract class Device {
    OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    abstract void store();
    abstract void interact();
    abstract void communicate();
    void changeOs(OperatingSystem os){
        this.os = os;
    }
}
