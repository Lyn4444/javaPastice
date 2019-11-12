class TestUSBInterface {
    public static void main(String[] args) {
        USBInterface[]  interfaces = {new USBSSD(), new USBMouse(), new USBLamp()};
        for(int i = 0; i < 3; i++)
            System.out.println(interfaces[i].connect());
    }
}

interface USBInterface{
    String connect();
}

class USBSSD implements USBInterface{
    @Override
    public String connect() {
        return "USB SSD has connected.";
    }
}

class USBMouse implements USBInterface{
    @Override
    public String connect() {
        return "USB mouse has connected.";
    }
}
class USBLamp implements USBInterface{
    @Override
    public String connect() {
        return "USB lamp has connected.";
    }
}