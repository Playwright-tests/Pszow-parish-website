package qa.listeners;

import io.qameta.allure.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener {

    private final Logger logger = LoggerFactory.getLogger(Listener.class);

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {

        return message;
    }

    @Override
    public void onStart(ITestContext iTestContext) {

        logger.info("SUITE: {}", iTestContext.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        logger.info("FINISH");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

        logger.info("Method: {}", iTestResult.getMethod().toString());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        logger.info("PASSED on method: {}", iTestResult.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        logger.error("FAILED on method: {}", iTestResult.getMethod());
        saveTextLog(iTestResult.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        logger.info("SKIPPED on method: {}", iTestResult.getMethod());
        saveTextLog(iTestResult.getThrowable().getMessage());
    }
}
