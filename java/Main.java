package AHSPCTemplates;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(900, 600);
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        window.addButton("test");
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        window.addLabel("test");
    }
}
