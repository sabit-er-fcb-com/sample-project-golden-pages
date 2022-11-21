package com.sample.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

// 1. Create a properties object
// we made it private, so it can't be inaccessible from outside
// made it static because static runs first, and we will use this object under static method
    private static Properties properties = new Properties();


    // creating a static block because
    static{
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("file not found in the ConfigurationReader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
