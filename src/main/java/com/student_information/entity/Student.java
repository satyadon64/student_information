package com.student_information.entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "STU_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "STU_ID")
	private long id;
	private String name;
	private String classes;
	private int roll;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "info_id")
	private Information information;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "edu_id")
	private Education education;
}
