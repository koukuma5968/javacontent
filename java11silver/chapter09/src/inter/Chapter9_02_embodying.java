package inter;

public class Chapter9_02_embodying extends Chapter9_01_impl {
    public void reboot() {
        super.force_shutdown();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.startup();
        System.out.println("再起動");
    }
}