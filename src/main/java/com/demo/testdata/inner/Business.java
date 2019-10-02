package com.demo.testdata.inner;

public class Business extends Profession {

    private String businessTurnOver;
    private String numberOfWorker;

    public String getBusinessTurnOver() {
        return businessTurnOver;
    }

    public String getNumberOfWorker() {
        return numberOfWorker;
    }

    public void setBusinessTurnOver(String businessTurnOver) {
        this.businessTurnOver = businessTurnOver;
    }

    public void setNumberOfWorker(String numberOfWorker) {
        this.numberOfWorker = numberOfWorker;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessTurnOver='" + businessTurnOver + '\'' +
                ", numberOfWorker='" + numberOfWorker + '\'' +
                "} " + super.toString();
    }
}
