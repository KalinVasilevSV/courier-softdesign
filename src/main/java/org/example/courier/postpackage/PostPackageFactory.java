package org.example.courier.postpackage;

import java.util.Locale;
import java.util.Random;

public class PostPackageFactory {
    String[] countries = Locale.getISOCountries();

    public PostPackage createPostPackage(PostPackageType packageType) {
        if (packageType == PostPackageType.PLOVDIV)
            return createPlovdivPostPackage();
        else if (packageType == PostPackageType.BULGARIA)
            return createBulgariaPostPackage();
        else if (packageType == PostPackageType.ABROAD)
            return createAbroadPostPackage();
        else throw new RuntimeException("No PostPackageType chosen.");
    }

    public PostPackage createPlovdivPostPackage() {
        Long id = new Random().nextLong();
        if (id < 0) id = -id;
        String content = "Some content";
        PostPackageType packageType = PostPackageType.PLOVDIV;
        String localAddress = "Kapana";
        return new PlovdivPostPackage(id, packageType, content, localAddress);
    }

    public PostPackage createBulgariaPostPackage() {
        Long id = new Random().nextLong();
        if (id < 0) id = -id;
        String content = "Some other content";
        PostPackageType packageType = PostPackageType.BULGARIA;
        String localAddress = "Some local address in Bulgaria";
        String city = "Somewhere in Bulgaria";
        return new BulgariaPostPackage(id, packageType, content, localAddress, city);
    }

    public PostPackage createAbroadPostPackage() {
        Long id = new Random().nextLong();
        if (id < 0) id = -id;
        String content = "Some other content";
        PostPackageType packageType = PostPackageType.ABROAD;
        String localAddress = "An address abroad";
        String city = "Foreign City";
        int index = new Random().nextInt();
        if (index < 0) index = -index;
        String countryCode = countries[index % countries.length];
        if (countryCode.equals("DK"))
            throw new RuntimeException("Uh-oh! There's something rotten in the state of Denmark!");

        return new AbroadPostPackage(id, packageType, content, localAddress, city, countryCode);
    }
}
