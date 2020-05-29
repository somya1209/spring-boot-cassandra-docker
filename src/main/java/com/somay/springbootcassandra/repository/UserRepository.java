package com.somay.springbootcassandra.repository;

import com.somay.springbootcassandra.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User,Long> {

}
