package org.example.courier.packagehandler;

import org.example.courier.postpackage.AbroadPostPackage;
import org.example.courier.postpackage.PlovdivPostPackage;
import org.example.courier.postpackage.PostPackage;

public class AbroadHandler implements PackageHandler{
    @Override
    public Boolean canHandle(PostPackage postPackage) {
        return postPackage instanceof AbroadPostPackage;
    }

    @Override
    public void handle(PostPackage postPackage) {
        System.out.println(postPackage + " handled by " + this);
    }
}
