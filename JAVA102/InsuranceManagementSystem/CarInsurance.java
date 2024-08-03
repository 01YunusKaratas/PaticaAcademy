package InsuranceManagementSystem;

public class CarInsurance extends Insurance {

    public CarInsurance() {
        super();

    }

    @Override
    public double calculate() {
        // Örnek hesaplama: Otomobil sigortası için sabit bir oran ve araç değerine göre
        // hesaplama
        double baseFee = 800;
        double carValue = 15000; // Örnek araç değeri
        double valueMultiplier = 0.05;
        return baseFee + (carValue * valueMultiplier);
    }

}
