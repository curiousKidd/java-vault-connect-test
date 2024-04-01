package kakao.aisp.javavaultconnecttest.service;

import kakao.aisp.javavaultconnecttest.model.entity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {

    Page<Employee> getEmployees();
}
