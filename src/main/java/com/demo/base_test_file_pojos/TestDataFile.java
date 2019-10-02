package com.demo.base_test_file_pojos;

import java.util.List;
import java.util.Map;

public class TestDataFile {
    private Map<String, Object> commonData;
    private Map<String, List<BaseTestData>> allTestData;

    public void setAllTestData(Map<String, List<BaseTestData>> allTestData) {
        this.allTestData = allTestData;
    }

    public Map<String, List<BaseTestData>> getAllTestData() {
        return allTestData;
    }

    public Map<String, Object> getCommonData() {
        return commonData;
    }

    public void setCommonData(Map<String, Object> commonData) {
        this.commonData = commonData;
    }

    @Override
    public String toString() {
        return "TestDataFile{" +
                "commonData=" + commonData +
                ", allTestData=" + allTestData +
                '}';
    }
}
