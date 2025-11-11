
  package reports;
  
  import com.aventstack.extentreports.*; 
  import com.aventstack.extentreports.reporter.ExtentSparkReporter;
  
  public class ExtentManager {
  
  public static ExtentReports extent;
  public static ExtentTest test;
  
  public static ExtentReports getReportsInstance() {
	  
	  try {
		if(extent == null) {
			ExtentSparkReporter  reporter = new ExtentSparkReporter("Reports/report.html");
			  extent = new ExtentReports();
			  extent.attachReporter(reporter);
				
		  }
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  return extent;
  }
  
  }
 