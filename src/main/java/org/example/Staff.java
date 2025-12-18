package org.example;

public class Staff extends Person{
    protected String school;
    protected double pay;
    Staff(String name, String address,String school, double pay){
        super(name,address);
        this.pay=pay;
        this.school=school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString()+" I work in "+school+" and my salary is "+pay;
    }
}
