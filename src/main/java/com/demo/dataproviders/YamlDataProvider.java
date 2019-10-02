package com.demo.dataproviders;

import com.demo.base_test_file_pojos.BaseTestData;
import com.demo.base_test_file_pojos.TestDataFile;
import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;

public class YamlDataProvider {

    @DataProvider(name = "YamlDataProvider")
    public Object[][] getDataFromYamlFile(Method method) throws FileNotFoundException {
        Yaml yml = new Yaml();

        String fileName = method.getDeclaringClass().getSimpleName() + ".yml";
        TestDataFile allTestCaseData = yml.loadAs(new FileReader(new File("src\\main\\resources\\test_data_files\\"+ fileName )), TestDataFile.class);
        List<BaseTestData> testDataSetList = allTestCaseData.getAllTestData().get(method.getName());
        Object[][] testDataArr = new Object[testDataSetList.size()][1];
        int i = 0;
        for (BaseTestData currentDataSet: testDataSetList)
        {
            testDataArr[i++][0] = currentDataSet;
        }
        return testDataArr;
    }
}
