package org.example.courier.packagehandler;

import org.example.courier.postpackage.PlovdivPostPackage;
import org.example.courier.postpackage.PostPackage;

public class PlovdivHandler implements PackageHandler{
    @Override
    public Boolean canHandle(PostPackage postPackage) {
        return postPackage instanceof PlovdivPostPackage;
    }

    @Override
    public void handle(PostPackage postPackage) {
        System.out.println(postPackage + " handled by " + this);
    }
}
