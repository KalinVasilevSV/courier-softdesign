package org.example.courier.postpackage;

import lombok.Data;

import java.util.Random;

@Data
public class PlovdivPostPackage extends PostPackage{
    public PlovdivPostPackage(Long id, PostPackageType packageType,String content,String localAddress){
        super(id, packageType, content, localAddress);
    }
    @Override
    public String toString(){
        return "Package[id:"+getPackageId()+",type:"+getPackageType()+",address:"+getLocalAddress()+"]";
    }
}
