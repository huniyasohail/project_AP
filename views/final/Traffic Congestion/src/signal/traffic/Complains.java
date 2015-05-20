package signal.traffic;


import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import java.sql.Time;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.UniqueConstraint;

@Entity
@Table(name="complains")
public class Complains {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "complain_id", unique = true, nullable = false)
    private int complainId;
	
	public int getComplainId() {
		return complainId;
	}

	public void setComplainId(int complainId) {
		this.complainId = complainId;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Handle getHandle_comp() {
		return handle_comp;
	}

	public void setHandle_comp(Handle handle_comp) {
		this.handle_comp = handle_comp;
	}

	
	
	@Column(name="complainDescription")
	private String description;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Handle handle_comp;
	
	 @OneToMany(mappedBy="complains")
	    private Set<VehicleOwner> complaint;
	
}
