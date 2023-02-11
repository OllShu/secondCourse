package transport;

public class DriverWithLicenseD extends Driver {
    private boolean licenseD;

    public DriverWithLicenseD(String FIO,
                              boolean driverLicense,
                              int experience,
                              boolean licenseD) {
        super(FIO, driverLicense, experience);
        this.licenseD = licenseD;
    }

    public boolean isLicenseD() {
        return licenseD;
    }

    public void setLicenseD(boolean licenseD) {
        this.licenseD = licenseD;
    }
}
