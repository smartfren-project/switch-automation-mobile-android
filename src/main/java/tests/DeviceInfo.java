package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeviceInfo {
    public String[] udid;
    public String[] version;
    public String port;
    public String bootStrapPort;

    public void fetchDeviceInfo() {
        String s = null;
        int freeE1s = 0;
        int length = 0;

        try {
            Process p = Runtime.getRuntime().exec("adb devices");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            System.out.println("Here is the standard output of the command:\n");
            List<String> udids = new ArrayList<>();
            List<String> version = new ArrayList<>();
            while ((s = stdInput.readLine()) !=null) {
                if((s.contains("device"))&&!(s.contains("List"))) {
                    System.out.println("adb devices : " + s);
                    udids.add(s.split("\\s")[0]);
                    freeE1s++;
                }
            }
            System.out.println("No of devices : " + freeE1s);
            String[] arr = new String[udids.size()];
            udid = udids.toArray(arr);
            for(int j=0; j<arr.length; j++){
                System.out.println("device udid" + udid[j]);
                // String v = MultipleDriverCreation
            }
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
