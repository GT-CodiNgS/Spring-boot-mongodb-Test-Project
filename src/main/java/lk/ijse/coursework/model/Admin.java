package lk.ijse.coursework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Document(collection = "admin")
public class Admin {
    @Id
    private String id;
    private String number;
    private String name;
    private String contact;
    private String email;
    private String pw;


}
