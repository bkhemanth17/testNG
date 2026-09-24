package testNGListeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class extentReportManager implements ITestListener{

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        //path for test report and report creation
        String path = System.getProperty("user.dir")+ "\\reports\\myReport.html";
        sparkReporter = new ExtentSparkReporter(path);

        //report name, title, theme(white/dark)
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("FD Calculator Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        //adding report to path
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        //environment variables
        extent.setSystemInfo("application", "Orange HRM");
        extent.setSystemInfo("operating system", System.getProperty("os.name"));
        extent.setSystemInfo("Done BY:", "Hemanth");
    }

    @Override
    public void onTestSuccess(ITestResult context) {
        test = extent.createTest(context.getName());
        test.log(Status.PASS, "Test case PASSED :"+context.getName());
    }

    @Override
    public void onTestFailure(ITestResult context) {
        test = extent.createTest(context.getName());
        test.log(Status.FAIL, "Test case Failed: "+context.getName());
        test.log(Status.FAIL, "Test case Failed cause is: "+context.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult context) {
        test = extent.createTest(context.getName());
        test.log(Status.SKIP,"Test case Skipped is: "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
