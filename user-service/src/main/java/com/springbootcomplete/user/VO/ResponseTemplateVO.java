package com.springbootcomplete.user.VO;

import com.springbootcomplete.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Department department;
    private User user;
}
