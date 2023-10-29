package pro.sky.collection.service;

import pro.sky.collection.model.Employee;

import java.security.spec.ECPoint;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {
    public List<Employee> getAllDepartment(int dep);

    public Map<Integer, List<Employee>> getAll();

    Optional<Employee> findEmployeeWithMaxSalaryInDepartment(int dep);

    Optional<Employee> findEmployeeWithMinSalaryInDepartment(int dep);
}
