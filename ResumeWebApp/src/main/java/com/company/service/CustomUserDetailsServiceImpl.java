package com.company.service;

import com.company.dao.impl.UserRepository;
import com.company.dao.impl.UserRepositoryCustom;
import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServiceInter userObj;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user =userObj.findByEmail(email);

       if(user !=null){
           UserBuilder builder=org.springframework.security.core.userdetails.User.withUsername(email);


           builder.disabled(false);
           builder.password((user.getPassword()));

           String[] authoritiesArr=new String[]{"ADMIN","USER","ROLE_ADMIN","ROLE_USER"}; // Authorityleri db da yaradib ordan ceke bilerik


           builder.authorities(authoritiesArr);

           return builder.build();
       }else{
           System.out.println("something went wrong here !");
           throw new UsernameNotFoundException("User not found");
       }
    }
}
