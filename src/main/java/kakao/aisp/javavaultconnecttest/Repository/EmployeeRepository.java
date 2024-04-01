package kakao.aisp.javavaultconnecttest.Repository;

import kakao.aisp.javavaultconnecttest.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
