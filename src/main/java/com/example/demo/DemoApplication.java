package com.example.demo;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    static int MinEventTimestamp = 0;
    static int MaxEventTimestamp = 0;
    static int flag = 0;
    static List<String> metricArray = new ArrayList<String>();
    static void writeMetricToFile(String data){

        metricArray.add(data);

    }
    static void readFile(){
        try {
            File myObj = new File("/home/lap12949/Documents/fresher/final-project/writemetric/src/input/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                writeMetricToFile(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        String a= this.region;
        SpringApplication.run(DemoApplication.class, args);
        readFile();
    }

}
