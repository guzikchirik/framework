package service;

import model.OperatingSystem;

public class OperatingSystemCreator {

    public static final String OPERATING_SYSTEM = "operating.system";

    /**
     * Operating System / Software
     * 0 - Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS
     * 1 - Paid: Windows Server 2008r2, Windows Server 2012r2, Windows Server 2016, Windows Core
     * 2 - Paid: Red Hat Enterprise Linux
     * 3 - Paid: Red Hat Enterprise Linux for SAP Applications
     * 4 - Paid: Red Hat Enterprise Linux for SAP with HA and Update Services
     * 5 - Paid: SLES
     * 6 - Paid: SLES 12 for SAP
     * 7 - Paid: SLES 15 for SAP
     * 8 - Paid: SQL Server Standard (2012, 2014, 2016, 2017, 2019)
     * 9 - Paid: SQL Server Web (2012, 2014, 2016, 2017, 2019)
     * 10 - Paid: SQL Server Enterprise (2012, 2014, 2016, 2017, 2019)
     */

    public static OperatingSystem withCredentialsFromProperty() {
        return new OperatingSystem(TestDataReader.getTestData(OPERATING_SYSTEM));
    }
}