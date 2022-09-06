package org.example.courier.packagehandler;

import org.example.courier.postpackage.BulgariaPostPackage;
import org.example.courier.postpackage.PlovdivPostPackage;
import org.example.courier.postpackage.PostPackage;

public class BulgariaHandler implements PackageHandler{
    @Override
    public Boolean canHandle(PostPackage postPackage) {
        return postPackage instanceof BulgariaPostPackage;
    }

    @Override
    public void handle(PostPackage postPackage) {
        System.out.println(postPackage + " handled by " + this);
    }
}
