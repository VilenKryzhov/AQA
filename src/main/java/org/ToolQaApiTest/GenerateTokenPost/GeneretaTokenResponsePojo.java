package org.ToolQaApiTest.GenerateTokenPost;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneretaTokenResponsePojo {
    public String token;
    public String expires;
    public String status;
    public String result;
}
