package com.test;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.XMLConfiguration;


/**
 * Created by yang.hua on 14-1-7.
 */

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, ConfigurationException {
        PropertiesConfiguration pc = new PropertiesConfiguration() ;
        pc.load("db.properties");
        System.out.println(pc.getString("db.name"));
    }
}
