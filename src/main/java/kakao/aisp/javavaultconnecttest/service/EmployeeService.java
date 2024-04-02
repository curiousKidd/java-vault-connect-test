package kakao.aisp.javavaultconnecttest.service;

import kakao.aisp.javavaultconnecttest.model.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Page<Employee> getEmployees();

    List<Employee> getEmployeesByLimit();
}
