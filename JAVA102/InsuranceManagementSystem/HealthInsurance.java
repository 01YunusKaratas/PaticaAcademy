package InsuranceManagementSystem;

public class HealthInsurance extends Insurance {

    public HealthInsurance() {
        super();
    }

    @Override
    public double calculate() {
        // Örnek hesaplama: Sabit bir oranla sağlık sigortası ücreti hesaplanıyor
        double baseFee = 1000;
        double multiplier = 1.2;
        return baseFee * multiplier;

    }

}
