package com.example.Report_UTRF.Security;

import com.example.Report_UTRF.dao.UsersRepository;
import com.example.Report_UTRF.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users=usersRepository.findByUsername(username);
        String password = users.getPassword();
        if(users==null){
            //throw new UsernameNotFoundException("User Not Found");
            throw new IllegalArgumentException("User Not Found");
        }
        if(!users.getPassword().equals(password)) {
            throw new IllegalArgumentException("password Not correct");
        }
        return new MyUserDetails(users);
    }
}
