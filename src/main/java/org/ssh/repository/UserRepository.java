package org.ssh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ssh.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo,Long> {

    public UserInfo findByUsername(String userName);
}
