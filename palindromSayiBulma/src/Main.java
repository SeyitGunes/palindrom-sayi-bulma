
public class Main {
    // Sayımız palindrom mu değil mi onu kontrol edeceğiz bu yüzden True/False kullanmak için boolean türünde

    static boolean isPalindrom(int number){
        // geçici olarak kullanmak için temp değişkenini oluşturduk
        // tersini hesaplamak için de reverseNumber adında bir değişken oluşturduk
        // her basamağı geçici olarak saklaması için lastNumber oluşturduk
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            // Her döngü adımında, temp değişkeninin son basamağı lastNumber değişkenine atanır ('5')
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;

        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(145));
    }
}