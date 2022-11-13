package vn.codegym.test_farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.test_farm.model.Employee;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    @Query(value = "SELECT e.* FROM employee e", countQuery = "SELECT e.* FROM employee", nativeQuery = true)
    List<Employee> findAll();

//    @Transactional
//    @Modifying
//    @Query(value = "INSERT INTO employee (birthday, identity_number, email, gender, img_url, name, username) VALUES (?,?,?,?,?,?,?,?)", nativeQuery = true)
//    void save(Date birthdate, String idCard, String email, Boolean gender, String img_url, String name, String username);

    @Override
    @Query(value = "SELECT e.* FROM employee e WHERE e.id=?1", countQuery = "SELECT e.* FROM employee e WHERE e.id=?1", nativeQuery = true)
    Optional<Employee> findById(Long id);

    @Override
    @Modifying
    @Query(value = "DELETE FROM employee e WHERE e.id=?1", nativeQuery = true)
    void deleteById(Long id);

//    @Transactional
//    @Modifying
//    @Query(value = "UPDATE employee SET `birthdate`=?1, `id_card`=?2, `email`=?3, `gender`=?4, `img_url`=?5, `name`=?6, `username_id`=?7 WHERE `id`=?8",nativeQuery = true)
//    void edit(Date birthdate, String idCard, String email, Boolean gender, String img_url, String name, String username, Long id);
}
