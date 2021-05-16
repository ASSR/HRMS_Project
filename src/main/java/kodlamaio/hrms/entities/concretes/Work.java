package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="works")
public class Work {
	@Id
	@GeneratedValue
	@Column(name="work_id")
	private int id;
	
	@Column(name="work_name")
	private String workName;
	
	@Column(name="company_user_id")
	private int companyUserId;
	
	@Column(name="active")
	private Boolean active;
	
	@Column(name="created_on")
	private Date createdOn;
}