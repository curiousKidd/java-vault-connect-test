## head
```
vault 를 활용하시 위한 테스트 프로젝트
동일한 프로젝트로  go, kotlin, java언어로 컨버팅 제작
개인적인 학습
```

java 21
spring boot 3.2.3
docker

## docker 설정 프로그램
vault:1.13.3 -> docker를 통해서 설정해보려 하였으나 1일차 장렬하게 실패하였습니다....
2일차 -> docker compose 를 활용한 local vault 설치는 완료하였으나, vault 설정하는 부분은 실패함... yml 파일 업데이트
3일차 -> 드디어 vault 설정 및 통신 테스트 완료... postman을 통한
     -> 이후 feign client 활용하여 접속 api 만들기 진행중

5일차 -> api 테스트 이후 feign client 테스트 완료
     -> 로그인 token 은 정상적으로 가져옴
     -> 이후 data를 가져오는 api 작성중

vault secret data 가져오기 성공     