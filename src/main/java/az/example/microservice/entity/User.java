package az.example.microservice.entity;

import az.example.microservice.constant.enums.UserRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "user_")
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    @Id
    @SequenceGenerator(name = "user_id_seq", allocationSize = 1, sequenceName = "user_id_seq")
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.SEQUENCE)
    Integer id;
    String username;
    String password;
    @Enumerated(EnumType.STRING)
    UserRole role;
    byte[] logo;
    String about;

}
