package TheLocaleClass;

import java.util.Arrays;
import java.util.Locale;

public class LocaleReview {
    public static void main(String[] args) {

        // List of Available Locales
        System.out.println("Number of Locales: " +
                Locale.getAvailableLocales().length);

        System.out.println("------Hong Kong Locales ------");
        // List only Locales with country code of "HK"
        Arrays.stream(Locale.getAvailableLocales())
                .filter((s) -> s.getCountry().equals("HK"))
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName()));

        System.out.println("------ Language only ------");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getCountry().length() == 0 && s.getLanguage().length() > 0)
                .limit(7)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName()));

        System.out.println("------ Locales with variants ------");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getVariant().length() > 0)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName() + " : " + s.getVariant()));

        System.out.println("------ Locales with extensions ------");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getExtensionKeys().size() > 0)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName() + " : " + s.getExtensionKeys()));

        System.out.println("--------- Static fields for common Locales --------");

        // Locale static variables for some specific Locales.
        System.out.println("Locale.ENGLISH = " + Locale.ENGLISH);
        System.out.println("Locale.FRENCH = " + Locale.FRENCH);
        System.out.println("Locale.FRANCE = " + Locale.FRANCE);
        System.out.println("Locale.CANADA = " + Locale.CANADA);
        System.out.println("Locale.CANADA_FRENCH = " + Locale.CANADA_FRENCH);
        System.out.println("--------------------------");

        // Default Locale can be retrieved
        System.out.println("Default Locale: " + Locale.getDefault());

        // User friendly Display Name can be used.
        System.out.println("DisplayName of default locale = " +
                Locale.getDefault().getDisplayName());

        // User friendly Display Name can be displayed using a different locale
        System.out.println("DisplayName of default locale for locale.FRENCH = " +
                Locale.getDefault().getDisplayName(Locale.FRENCH));




        Locale vietnameseLocaleWithVariant = new Locale("vi", "", "Miracle");

        // In ra thông tin của Locale
        System.out.println("Locale with Variant: " + vietnameseLocaleWithVariant);

        // Bạn cũng có thể sử dụng Locale.Builder để làm điều tương tự
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("vi").setVariant("Miracle");
        Locale anotherVietnameseLocale = builder.build();

        // In ra thông tin của Locale sử dụng Locale.Builder
        System.out.println("Another Vietnamese Locale with Variant: " + anotherVietnameseLocale);
    }
}
