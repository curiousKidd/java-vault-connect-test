package kakao.aisp.javavaultconnecttest.controller;

import kakao.aisp.javavaultconnecttest.model.entity.Employee;
import kakao.aisp.javavaultconnecttest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<Page<Employee>> getEmployees() {
        return ResponseEntity.ok().body(employeeService.getEmployees());
    }

}
