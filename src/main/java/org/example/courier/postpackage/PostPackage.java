package org.example.courier.postpackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class PostPackage {
    @NonNull
    @Positive
    private Long packageId;
    @NonNull
    @Range(min = 1, max = 3)
    private PostPackageType packageType;
    private String content;
    @NotBlank
    private String localAddress;
}
