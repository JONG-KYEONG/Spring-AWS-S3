# Spring-AWS-S3
Spring 3.3.1 ver. Aws s3
# Manual
- S3 버킷을 생성합니다
- application.properties에 액세스 키, 시크릿 키, 버킷 이름을 추가해줍니다.
```properties
#AWS
cloud.aws.credentials.accessKey=${S3_ACCESSKEY}
cloud.aws.credentials.secretKey=${S3_SECRETKEY}
cloud.aws.s3.bucket=${bucket_name}
cloud.aws.region.static=ap-northeast-2
cloud.aws.stack.auto=false
```
# Controller
- 파일을 http://localhost:8080/aws 엔드포인트로 POST 요청을 통해 전송하고, 해당 파일을 AWS S3에 저장한 후 URL을 반환합니다.
### 요청
- URL: http://localhost:8080/aws
- HTTP 메서드: POST
- 컨텐츠 타입: multipart/form-data
- 요청 바디: 폼 데이터에 포함된 파일
### 응답
- URL을 반환합니다.
