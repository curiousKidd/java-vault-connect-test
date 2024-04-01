package kakao.aisp.javavaultconnecttest.service.impl;

import kakao.aisp.javavaultconnecttest.Repository.EmployeeRepository;
import kakao.aisp.javavaultconnecttest.model.entity.Employee;
import kakao.aisp.javavaultconnecttest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getEmployees() {
        Pageable pageable = Pageable.ofSize(10);

        return employeeRepository.findAll(pageable);
    }
}
