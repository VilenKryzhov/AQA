package org.API;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostUserResponse extends CreatePostUserRequest {
   public String name;
   public String leader;
   public String id;
   public String createdAt;
}
