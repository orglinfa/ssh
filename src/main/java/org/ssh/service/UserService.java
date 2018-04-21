package org.ssh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.entity.UserInfo;
import org.ssh.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserInfo findByUserName(String userName){
        return userRepository.findByUserName( userName);
    }
}
