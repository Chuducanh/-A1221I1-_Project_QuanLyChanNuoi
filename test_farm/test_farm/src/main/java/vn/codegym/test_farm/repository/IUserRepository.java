package vn.codegym.test_farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.test_farm.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
}
