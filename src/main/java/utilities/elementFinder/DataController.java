//package utilities.elementFinder;
//
//import utilities.fileReadWrite.PropertiesFileReaderWriter;
//
//import java.util.Hashtable;
//
//public class DataController {
//    public Hashtable<String, String> propertiesFileData = null;
//    private PropertiesFileReaderWriter propertiesFileReaderWriter = null;
//
//    public DataController(String testDataFilePath, String fileName) throws Exception {
//        propertiesFileData = new Hashtable<>();
//        propertiesFileReaderWriter = new PropertiesFileReaderWriter();
//        propertiesFileData = propertiesFileReaderWriter.loadTestData(testDataFilePath, fileName);
//    }
//
//    public Hashtable<String, String> getPropertiesFileData() {
//        return propertiesFileData;
//    }
//
//    public void addPropertiesFileData(Hashtable<String, String> propertiesFileDataToBeAdded) {
//        propertiesFileData.putAll(propertiesFileDataToBeAdded);
//    }
//}
