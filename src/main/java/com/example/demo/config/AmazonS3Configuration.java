package com.example.demo.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonS3Configuration {
//    @Value("${spring.datasource.region}")
//    private static String region;
//
//    @Value("${spring.datasource.access_key}")
//    static String access_key;
//
//    @Value("${spring.datasource.secret_key}")
//    static String secret_key;

    static  String region= "HCM01";
    static String access_key="acb433b31e064b4bbe6994a87f0cb6ee";
    static String secret_key="9205abdcb7216342bdbc127360af6435";
    @Bean
    public static AmazonS3 s3client() {
        AWSCredentials l_credentials = new BasicAWSCredentials(
                access_key,
                secret_key
        );
        return AmazonS3ClientBuilder.standard().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(l_credentials)).build();
    }
}
