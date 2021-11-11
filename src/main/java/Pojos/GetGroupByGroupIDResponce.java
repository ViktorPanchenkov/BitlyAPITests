package Pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GetGroupByGroupIDResponce {

    @JsonProperty("guid")
    private String Guid;
    @JsonProperty("name")
    private String Name;
    @JsonProperty("role")
    private String Role;
    @JsonProperty("is_active")
    private boolean Is_Active;

}
