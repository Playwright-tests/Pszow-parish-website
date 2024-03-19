FROM mcr.microsoft.com/playwright/java:v1.40.0-jammy
LABEL authors="pawelaksman"
LABEL version="1.0"
ENV BROWSER_TYPE=chrome
WORKDIR /usr/src/test/
COPY . /usr/src/test/
RUN mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install chrome"
CMD mvn clean test /
    -DQASE_ENABLE=true /
    -DQASE_PROJECT_CODE="PWPWT" /
    -DQASE_RUN_NAME="E2E" /
    -DQASE_RUN_DESCRIPTION"Tests in Chrome browser" /
    -DQASE_API_TOKEN="TOKEN"