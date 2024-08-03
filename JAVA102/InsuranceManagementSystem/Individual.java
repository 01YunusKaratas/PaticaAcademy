package InsuranceManagementSystem;

public class Individual extends Account {

    public Individual(User user1) {
        super(user1);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {

        double feeWithMargin = insurance.getFee() * 1.10;
        insurance.setFee(feeWithMargin);
        getInsurances().add(insurance);

    }

}
