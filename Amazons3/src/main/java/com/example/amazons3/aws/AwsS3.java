package com.example.amazons3.aws;

import lombok.Getter;

@Getter
public class AwsS3 {
    private String key;  // 파일명
    private String path;  // url

    public AwsS3(String key, String path) {
        this.key = key;
        this.path = path;
    }
}