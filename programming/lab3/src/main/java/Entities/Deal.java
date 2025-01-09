package Entities;

public class Deal {
    private String name;
    boolean isProfitable;

    public Deal(String name) {
        this.name = name;
    }

    public String dealProcess(boolean status) {
        isProfitable = status;
        String result = name + "принимало " + (status ? "выгодный ":"невыгодный ") + "для нас оборот";
        return result;
    }
}
