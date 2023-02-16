package transport;

public class DriverWithLicenseC extends Driver {
    private boolean licenseC;

    public DriverWithLicenseC(String FIO,
                              boolean driverLicense,
                              int experience,
                              boolean licenseC) {
        super(FIO, driverLicense, experience);
        this.licenseC = licenseC;
    }

    public boolean isLicenseC() {
        return licenseC;
    }

    public void setLicenseC(boolean licenseC) {
        this.licenseC = licenseC;
    }
}
