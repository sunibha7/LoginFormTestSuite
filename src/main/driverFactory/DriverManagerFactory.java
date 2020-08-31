package main.driverFactory;

public class DriverManagerFactory {

	public static DriverManager getManager(String driverType) {

        DriverManager driverManager;

        switch (driverType) {
            case "CHROME":
                driverManager = new ChromeDriverManager();
                break;
            case "SAFARI":
                driverManager = new SafariDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        
        return driverManager;
        

	}
}
