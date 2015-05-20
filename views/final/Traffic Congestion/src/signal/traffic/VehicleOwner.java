package signal.traffic;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import java.sql.Time;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.UniqueConstraint;

@Entity
@Table(name="VehicleOwners")

public class VehicleOwner {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "car_id", unique = true, nullable = false)
    private int carId;
	

	@OneToOne
	@PrimaryKeyJoinColumn
	private RoadCongestion roadid;
     
	@Column(name="Ownerid")
	private int onwerid;
	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public RoadCongestion getRoadid() {
		return roadid;
	}

	public void setRoadid(RoadCongestion roadid) {
		this.roadid = roadid;
	}

	public int getOnwerid() {
		return onwerid;
	}

	public void setOnwerid(int onwerid) {
		this.onwerid = onwerid;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public float getTimearrival() {
		return timearrival;
	}

	public void setTimearrival(float timearrival) {
		this.timearrival = timearrival;
	}

	public int getEmergency() {
		return emergency;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public int getCarLane() {
		return carLane;
	}

	public void setCarLane(int carLane) {
		this.carLane = carLane;
	}

	public RoadCongestion getBlock() {
		return block;
	}

	public void setBlock(RoadCongestion block) {
		this.block = block;
	}

	public Complains getComplains() {
		return complains;
	}

	public void setComplains(Complains complains) {
		this.complains = complains;
	}

	@Column(name="lisence")
	private String license;
	
	@Column(name="age")
	private int age;
	
	@Column(name="parking")
	private boolean parking;
	
	@Column(name="TimeArrival")
	private float timearrival;
	
	@Column(name="emergency")
	private int emergency;
	
	@Column(name="CarsinLane")
	private int carLane;
	
	@ManyToOne
    @JoinColumn(name="road_id")
    private RoadCongestion block;
	
	@ManyToOne
    @JoinColumn(name="complain_id")
    private Complains complains;
	
}
