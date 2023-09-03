package com.student_information.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "STU_INFORMATION")
public class Information {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "INFO_ID")
	private long id;
	private String name;
	private String email;
	private long mobile;

}
