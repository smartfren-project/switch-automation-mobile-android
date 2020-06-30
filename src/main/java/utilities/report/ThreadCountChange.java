//package utilities.report;
//
//import org.testng.IAlterSuiteListener;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.xml.XmlSuite;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public abstract class ThreadCountChange implements ITestListener, IAlterSuiteListener {
//    int freeE1s = 0;
//
//    @Override
//    public void onStart(ITestContext context) {
//
//
//
//    }
//
//
//    @Override
//    public void alter(List<XmlSuite> suites) {
//
//        System.out.println("****************************************************************/nInside AlterSuiteNameListener");
//
//        try {
//            freeE1s = noOfDevice();
//        } catch (Exception e) {
//        }
//        XmlSuite suite = suites.get(0);
//        suite.setThreadCount(freeE1s);
//
//
//    }
//
//    public int noOfDevice() throws Exception {
//        String s = null;
//
//        int length = 0;
//
//        Process p = Runtime.getRuntime().exec("adb devices");
//        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//        // read the output from the command
//        System.out.println("Here is the standard output of the command:\n");
//        List<String> udids = new ArrayList<>();
//        List<String> version = new ArrayList<>();
//        while ((s = stdInput.readLine()) != null) {
//            if ((s.contains("device")) && !(s.contains("List"))) {
//                System.out.println("adb devices :" + s);
//                udids.add(s.split("\\s")[0]);
//                freeE1s++;
//
//            }
//        }
//        return freeE1s;
//
//    }
//}
