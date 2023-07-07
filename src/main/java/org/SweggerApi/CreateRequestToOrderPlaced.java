package org.SweggerApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRequestToOrderPlaced {
    public Integer id;
    public Integer petId;
    public Integer quantity;
    public String shipDate;
    public String status;
    public Boolean complete;
}
