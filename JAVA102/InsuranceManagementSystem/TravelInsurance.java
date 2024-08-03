package InsuranceManagementSystem;

public class TravelInsurance extends Insurance {

    public TravelInsurance() {

        super();
    }

    @Override
    public double calculate() {
        // Örnek hesaplama: Seyahat sigortası için sabit bir oran ve gün sayısına göre
        // ücret hesaplanıyor
        double baseFee = 300;
        int numberOfDays = (int) ((getFinished().getTime() - getStarting().getTime()) / (1000 * 60 * 60 * 24));
        double dailyRate = 20;
        return baseFee + (dailyRate * numberOfDays);
    }

}
