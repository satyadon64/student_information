package com.student_information.entity;
import javax.persistence.CascadeType;
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
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	@JoinColumn(name= "INFO_ID")
	private Information information;
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	@JoinColumn(name= "EDU_ID")
	private Education education;
}
