public abstract class SiemensMobile implements Mobile {
    private String model;

    public SiemensMobile(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Implement the call method from the Mobile interface
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from " + model);
    }

    // Implement the sendMessage method from the Mobile interface
    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + " from " + model + ": " + message);
    }

    // Define an abstract method specific to SiemensMobile
    public abstract void customizeSettings();
}

