package com.demo.base_test_file_pojos;

public class BaseTestData {

    private String testDataId;
    private String testDataCategory;
    private String featureName;

    public void setTestDataId(String testDataId) {
        this.testDataId = testDataId;
    }

    public void setTestDataCategory(String testDataCategory) {
        this.testDataCategory = testDataCategory;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getTestDataId() {
        return testDataId;
    }

    public String getTestDataCategory() {
        return testDataCategory;
    }

    public String getFeatureName() {
        return featureName;
    }

    @Override
    public String toString() {
        return "BaseTestData{" +
                "testDataId='" + testDataId + '\'' +
                ", testDataCategory='" + testDataCategory + '\'' +
                ", featureName='" + featureName + '\'' +
                '}';
    }
}
