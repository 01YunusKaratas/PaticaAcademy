package InsuranceManagementSystem;

public class Enterprise extends Account {

    public Enterprise(User user1) {
        super(user1);
    }

    @Override

    public void addInsurancePolicy(Insurance insurance) {
        // Kurumsal müşteriler için kar marjı örneği: %20
        double feeWithMargin = insurance.getFee() * 1.20;
        insurance.setFee(feeWithMargin);
        getInsurances().add(insurance);
    }

}
