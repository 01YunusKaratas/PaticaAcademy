package InsuranceManagementSystem;

import java.util.Date;

public abstract class Insurance {

    private String ınsuranceName;
    private double fee;
    private Date starting;
    private Date finished;

    public Insurance() {

    }

    public abstract double calculate();
    

    /**
     * @return String return the ınsuranceName
     */
    public String getInsuranceName() {
        return ınsuranceName;
    }

    /**
     * @param ınsuranceName the ınsuranceName to set
     */
    public void setInsuranceName(String ınsuranceName) {
        this.ınsuranceName = ınsuranceName;
    }

    /**
     * @return double return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * @return Date return the starting
     */
    public Date getStarting() {
        return starting;
    }

    /**
     * @param starting the starting to set
     */
    public void setStarting(Date starting) {
        this.starting = starting;
    }

    /**
     * @return Date return the finished
     */
    public Date getFinished() {
        return finished;
    }

    /**
     * @param finished the finished to set
     */
    public void setFinished(Date finished) {
        this.finished = finished;
    }

}
