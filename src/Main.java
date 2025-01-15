import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj="JAVA ile programlamaya giriş eğitimime başarıyla devam ediyorum.";

        System.out.println(mesaj);
        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(5));
        System.out.println(mesaj.concat("Bunu istikrarlı bir şekilde sürdüreceğime eminim."));
        System.out.println(mesaj.indexOf("d"));
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.endsWith("J"));
        System.out.println(mesaj.startsWith("J"));
        System.out.println(mesaj.trim());

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        for(String kelime : mesaj.split( " ")){
            System.out.println(kelime);

        }


    }
}