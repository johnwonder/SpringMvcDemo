package com.john.repository;

import com.john.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by john on 2016/9/12.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {


}
