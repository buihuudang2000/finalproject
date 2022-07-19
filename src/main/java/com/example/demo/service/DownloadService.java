package com.example.demo.service;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.example.demo.config.AmazonS3Configuration;
import org.springframework.context.annotation.Bean;

public class DownloadService{
//    private static void displayTextInputStream(InputStream input) throws IOException
//    {
//        // Read one text line at a time and display.
//        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//        while(true)
//        {
//            String line = reader.readLine();
//            if(line == null) break;
//            System.out.println( "    " + line );
//        }
//        System.out.println();
//    }
    @Bean
    public static String downloadFile()
        {
            AmazonS3 s3= AmazonS3Configuration.s3client();
//            BucketWebsiteConfiguration config = s3.getBucketWebsiteConfiguration("portal.vngcloud.vn");
//            S3Object s3object = s3.getObject("tunm4_metics.hcm01.vstorage.vngcloud.vn","dev/");
            return s3.toString();
        }


}