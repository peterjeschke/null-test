package dev.jeschke.pokerandom;


import org.jetbrains.annotations.Nullable;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
public class MyObject {
    @Nullable
    private String myString;
    @NonNull
    private String nonNullString;
}
