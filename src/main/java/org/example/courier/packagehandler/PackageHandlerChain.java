package org.example.courier.packagehandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.courier.postpackage.PostPackage;

import java.util.List;

@Data
@AllArgsConstructor
public class PackageHandlerChain {
    private List<PackageHandler> handlers;

    public void handle(PostPackage postPackage) {
        for (PackageHandler packageHandler : handlers) {
            if (packageHandler.canHandle(postPackage))
                packageHandler.handle(postPackage);
        }
    }
}
