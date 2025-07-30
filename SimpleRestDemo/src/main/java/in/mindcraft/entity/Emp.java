package in.mindcraft.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Emp_id")
	private int id;
	
	@Column(name="Emp_name")
	private String name;
	private String deptname;
	
}
