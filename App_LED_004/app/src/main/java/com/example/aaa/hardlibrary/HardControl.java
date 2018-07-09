package  com.example.aaa.hardlibrary;

public class HardControl{
    public static native int LedCtrl(int which, int status);
    public static native int LedOpen();
    public static native void Ledclose();

    static {
        try {
            System.loadLibrary("hardcontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}