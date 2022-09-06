package org.example.courier;

import org.example.courier.packagehandler.*;
import org.example.courier.postpackage.PostPackage;
import org.example.courier.postpackage.PostPackageFactory;
import org.example.courier.postpackage.PostPackageType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourierApp {
    public static void main(String[] args) {

        PrintStream jout = System.out;
        Scanner jin = new Scanner(System.in);
        PostPackageFactory packageFactory = new PostPackageFactory();
        List<PackageHandler> packageHandlers = new ArrayList<>();
        packageHandlers.add(new PlovdivHandler());
        packageHandlers.add(new BulgariaHandler());
        packageHandlers.add(new AbroadHandler());
        PackageHandlerChain packageHandlerChain = new PackageHandlerChain(packageHandlers);

        System.out.println("### Welcome to Courier!");
        while (true) {
            jout.println("Would you like to send a package? y/n ");

            try {
                char input = jin.nextLine().charAt(0);
                if (input == 'y') {

                    jout.println("Where should we send it to?\n" +
                            "0. Plovdiv\n" +
                            "1. Somewhere in Bulgaria\n" +
                            "2. Somewhere abroad\n");

                    int index = jin.nextInt();
                    jin.nextLine();
                    PostPackageType packageType = PostPackageType.values()[index];
                    PostPackage postPackage = packageFactory.createPostPackage(packageType);
                    packageHandlerChain.handle(postPackage);
                } else {
                    jout.println("You did not choose to send a package. Bye!");
                    break;
                }
            } catch (Exception e) {
                jout.println("Whoops!");
                jout.println(e.getMessage());
                jout.println("Try again!");
            }
        }
        jin.close();
    }
}
