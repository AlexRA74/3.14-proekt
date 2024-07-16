package ru.kata.spring.boot_security.demo.repositories;

import antlr.collections.List;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAll();
    void saveRole(Role role);
}