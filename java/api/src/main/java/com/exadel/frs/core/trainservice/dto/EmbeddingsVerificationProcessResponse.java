package com.exadel.frs.core.trainservice.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmbeddingsVerificationProcessResponse implements EmbeddingsProcessResponse {

    private List<EmbeddingVerificationProcessResult> result;
}
