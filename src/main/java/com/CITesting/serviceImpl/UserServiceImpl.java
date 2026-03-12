package com.CITesting.serviceImpl;

import com.CITesting.dao.UserRepo;
import com.CITesting.model.User;
import com.CITesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
   private UserRepo userRepo;


    @Override
    public String save(User user)
    {
        userRepo.save(user);
        return "SAVED";
    }
}
