package lk.ijse.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Gayash Thasmika
 * @date:7/22/2021
 * @since : 0.0.1
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {

    private String id;
    private String name;
    private String contact;
    private String email;
    private String pw;
    private String address;

}
