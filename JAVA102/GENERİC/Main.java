package GENERİC;

public class Main {
    public static void main(String[] args) {
        // Yeni bir MyLıst oluşturuyoruz
        MyLıst<Integer> list1 = new MyLıst<>();

        // Listeyi test ediyoruz
        System.out.println("Dizideki eleman sayısı: " + list1.size());
        System.out.println("Dizinin kapasitesi: " + list1.getCapacity());

        // Eleman ekliyoruz
        list1.add(10);
        list1.add(20);

        // Listeyi tekrar test ediyoruz
        System.out.println("Dizideki eleman sayısı: " + list1.size());
        System.out.println("Dizinin kapasitesi: " + list1.getCapacity());

        // Elemanları yazdırıyoruz
        System.out.println("Liste içeriği: " + list1);

        // Listeye eleman ekleyip yazdırıyoruz
        list1.add(30);
        System.out.println("Liste içeriği (eklenen elemanla): " + list1);

        // SubList örneği
        MyLıst<Integer> subList = list1.subList(0, 2);
        System.out.println("SubList: " + subList);

        // Liste boş mu kontrol ediyoruz
        System.out.println("Liste boş mu: " + list1.isEmpty());

        // Eleman çıkarıyoruz ve sonucu kontrol ediyoruz
        list1.remove(1); // 20'yi çıkarır
        System.out.println("Liste içeriği (bir eleman çıkarıldıktan sonra): " + list1);
        System.out.println("Liste içeriği (diziye dönüştürülmüş hali): " + java.util.Arrays.toString(list1.toArray()));
    }
}
