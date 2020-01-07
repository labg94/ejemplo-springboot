package com.benavides.ejemplospringboot.service;

import com.benavides.ejemplospringboot.model.User;
import com.benavides.ejemplospringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User save = userRepository.save(user);
        log.info("user saved {}",save);
        return save;
    }


    @Override
    public List<User> showAll(){
        return userRepository.findAll();
    }

    @Override
    public List<User> findByName(String name){
        return userRepository.findAllByName(name);
    }

    @Override
    public boolean deleteUser(String id){
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            userRepository.delete(byId.get());
            return true;
        }else{
            return  false;
        }
    }


}
