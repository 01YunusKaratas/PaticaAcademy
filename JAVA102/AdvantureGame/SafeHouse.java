package JAVA102.AdvantureGame;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation() {
        // Oyuncunun mevcut sağlığını maksimum sağlığa ayarla
        getPlayer().setHealty(getPlayer().getRhealty());

        // Ekrana iyileşme ve güvenli evde olma mesajını yazdır
        System.out.println("İyileştiniz...");
        System.out.println("Şu an Güvenli Evdesiniz.");

        // Oyuncunun mevcut sağlığını ve maksimum sağlığını ekrana yazdır
        System.out.println("Mevcut Sağlık: " + getPlayer().getHealty());
        System.out.println("Maksimum Sağlık: " + getPlayer().getRhealty());

        return true;
    }
}
