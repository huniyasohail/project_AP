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
import javax.persistence.Table;
import java.sql.Time;
import java.util.Set;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="complains")
public class TrafficPolice {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "police_id", unique = true, nullable = false)
    private int policeId;
	
	@Column(name="police_name")
	private String policeName;
	
	@Column(name="police_name")
	private String policename; 
	
	@Column(name="road_id")
	private RoadCongestion road;
	
	@Column(name="time_duration")
	private float timeduration;
	
	
	
}
