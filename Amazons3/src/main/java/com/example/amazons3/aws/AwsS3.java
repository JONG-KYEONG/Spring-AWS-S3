package com.example.amazons3.aws;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AwsS3 {
    private String key;  // 파일명
    private String path;  // url
}
