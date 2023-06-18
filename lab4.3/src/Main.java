public class Main {
    public static void main(String[] args) {

        SiemensMobile mobile = new Model("Siemens A100");
        mobile.call("123456789");
        mobile.sendMessage("987654321", "Hello!");

        mobile.customizeSettings();
    }
}