package org.example.courier.postpackage;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class AbroadPostPackage extends PostPackage {
    @NotBlank
    private String city;
    @NotBlank
    private String countryCode;

    public AbroadPostPackage(Long id, PostPackageType packageType, String content, String localAddress, String city, String countryCode) {
        super(id, packageType, content, localAddress);
        this.city = city;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Package[id:" + getPackageId() + ",type:" + getPackageType() + ",address:" + getLocalAddress() + ",city:" + getCity() + ",country:" + getCountryCode() + "]";
    }
}
