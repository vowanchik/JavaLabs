public class Model extends SiemensMobile {
    public Model(String model) {
        super(model);
    }

    // Implement the customizeSettings method specific to Model
    @Override
    public void customizeSettings() {
        System.out.println("Customizing settings for " + getModel());
    }
}
