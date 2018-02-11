import java.util.Properties;
import java.io.*;

public class ConfigReader{

    private final String file_name = "config";
    private final String SERVER_IP = "127.0.0.1";
    private final int PORT = 6789;
    private final String PASSWORD_FILE = System.getProperty("user.dir") + "/password";

    private FileInputStream in;


    public ConfigReader(){

        try{
            in = new FileInputStream(file_name);

        }catch (FileNotFoundException e){
            System.err.println("Configuration file 'config' not found. Loading default values.");

        }
    }


}