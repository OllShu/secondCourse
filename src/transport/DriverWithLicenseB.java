package transport;

public class DriverWithLicenseB extends Driver {
    private boolean licenseB;

    public DriverWithLicenseB(String FIO,
                              boolean driverLicense,
                              int experience,
                              boolean licenseB) {
        super(FIO, driverLicense, experience);
        this.licenseB = licenseB;
    }

    public boolean isLicenseB() {
        return licenseB;
    }

    public void setLicenseB(boolean licenseB) {
        this.licenseB = licenseB;
    }
}
