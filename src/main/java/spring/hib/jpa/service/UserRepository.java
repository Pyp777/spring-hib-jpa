package spring.hib.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.hib.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
