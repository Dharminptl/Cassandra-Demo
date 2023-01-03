package com.example.CassandraDemo;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Student {
	
	private String name;
	
    @PrimaryKey
	private Integer id;
	
    @Column("department_id")
	private Integer departmentid;
	
	private String email;
	
    @Column("student_id")
	private Integer studentId;



}
