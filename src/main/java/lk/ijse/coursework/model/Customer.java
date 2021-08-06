package lk.ijse.coursework.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author : Gayash Thasmika
 * @date:7/22/2021
 * @since : 0.0.1
 **/


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Customer {
    @Id
    private String id;
    private String name;
    private String contact;
    private String email;
    private String pw;
    private String address;

}
