package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListUsers {
    public Integer id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

}
