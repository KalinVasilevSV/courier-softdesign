package org.example.courier.packagehandler;

import org.example.courier.postpackage.PostPackage;

public interface PackageHandler {
    Boolean canHandle(PostPackage postPackage);
    void handle(PostPackage postPackage);
}
