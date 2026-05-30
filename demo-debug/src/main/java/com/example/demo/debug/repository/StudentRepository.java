package com.example.demo.debug.repository;

import com.example.demo.debug.entity.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StudentRepository extends CassandraRepository<Student, Integer> {
}
