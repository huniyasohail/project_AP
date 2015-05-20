package signal.traffic;



import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Set;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="handle")
public class Handle {
	@Id 
	@Column(name="complain_id")
	private int complainid;
	
	@Column(name="suggestion_id")
	private int suggestionid;
	
	}
