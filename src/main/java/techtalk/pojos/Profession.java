package techtalk.pojos;

public class Profession {    
    private String professionName;
    private String preffesionType;

    public String getProfessionName() {
        return professionName;
    }

    public String getPreffesionType() {
        return preffesionType;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public void setPreffesionType(String preffesionType) {
        this.preffesionType = preffesionType;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "professionName='" + professionName + '\'' +
                ", preffesionType='" + preffesionType + '\'' +
                '}';
    }
}
