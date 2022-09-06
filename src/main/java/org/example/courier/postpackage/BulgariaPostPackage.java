package org.example.courier.postpackage;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class BulgariaPostPackage extends PostPackage {
    @NotBlank
    private String city;

    public BulgariaPostPackage(Long id, PostPackageType packageType, String content, String localAddress, String city) {
        super(id, packageType, content, localAddress);
        this.city = city;
    }

    @Override
    public String toString() {
        return "Package[id:" + getPackageId() + ",type:" + getPackageType() + ",address:" + getLocalAddress() + ",city:" + getCity() + "]";
    }
}
