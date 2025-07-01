    # 1. Java가 포함된 베이스 이미지
    FROM openjdk:17-jdk-slim

    # 2. 작업 디렉토리 설정
    WORKDIR /app

    # 3. 빌드된 jar 파일 복사
    COPY build/libs/hellop-0.0.1-SNAPSHOT.jar app.jar

    # 4. 앱 실행
    ENTRYPOINT ["java", "-jar", "app.jar"]