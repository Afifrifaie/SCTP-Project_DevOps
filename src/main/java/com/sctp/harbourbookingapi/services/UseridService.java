package com.sctp.harbourbookingapi.services;

import java.util.ArrayList;

import com.sctp.harbourbookingapi.entity.Userid;

public interface UseridService {
    Userid saveUserid(Userid userid);

    ArrayList<Userid> getAllUserid();

    Userid findUserIdById(int id);

    Userid updateUserid(int id, Userid userid);

    void deleteUserid(int id);

    Userid findUserByUserID(String userid);

    String findPassWordByUserID(String userid);
    
    void verifyPassword(String userid, String password);

}

