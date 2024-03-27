import java.util.*;

public class hashMapp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("Masukkan pasangan kunci-nilai ke dalam HashMap (ketik 'selesai' untuk mengakhiri):");

        while (true) {
            System.out.print("Masukkan kunci: ");
            String key = scanner.nextLine();

            if (key.equals("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai: ");
            int value = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline yang tersisa

            hashMap.put(key, value);
        }

        System.out.println("\nIsi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }

        scanner.close();
    }
}
