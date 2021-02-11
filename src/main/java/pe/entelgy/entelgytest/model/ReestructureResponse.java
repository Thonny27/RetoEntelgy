package pe.entelgy.entelgytest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReestructureResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("data")
    private List<String> data;
}
