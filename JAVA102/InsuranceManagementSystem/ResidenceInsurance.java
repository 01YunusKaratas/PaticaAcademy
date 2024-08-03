package InsuranceManagementSystem;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance() {
        super();
    }

    @Override
    public double calculate() {
        // Örnek hesaplama: Konut sigortası için sabit bir oran ve ek bir maliyet
        // hesaplanıyor
        double baseFee = 500;
        double areaMultiplier = 1.5;
        return baseFee * areaMultiplier + 200;
    }
}
