package kakao.aisp.javavaultconnecttest.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee {

    @Id
    private String emp_no;
    private LocalDate birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private LocalDate hire_date;

}
