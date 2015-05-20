package signal.traffic;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Time;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.UniqueConstraint;

@Entity
@Table(name="RoadCongestion")

public class RoadCongestion {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "road_id", unique = true, nullable = false)
	private int roadId;



	@Column(name="roadname")
	private String roadname;

	@Column(name="NoOfLanes")
	private int noOfLanes;

	@Column(name="timeofcongestion")
	private Time timeofcongestion;

	@OneToMany(mappedBy="block")
    private Set<VehicleOwner> owner;

	@Column(name="signalduration")
	private Time signalduration;


	@Column(name="Noofaccidents")
	private int nofaccidents;

	@Column(name="NoofCars")
	private int noofCars;

	
	@Column(name="TotalCars")
	private int totalCars;

	@Column(name="NoofLanes")
	private int totalLanes;

	public String getRoadname() {
		return roadname;
	}

	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}



	public RoadCongestion() {}

	void setroad_id(int roadId ){
		this.roadId=roadId;
	}

	int getroad_id(){
		return roadId;
	}


	void settimeofcongestion(Time timeofcongestion ){
		this.timeofcongestion=timeofcongestion;
	}

	Time gettimeofcongestion(){
		return timeofcongestion;
	}


	void setnoofaccident(int nofaccidents ){
		this.nofaccidents=nofaccidents;
	}

	int getnofaccidents(){
		return nofaccidents;
	}



	// Getter and Setter methods

	public RoadCongestion(int roadId,String roadname,Time signalduration,Time timeofcongestion, int nofaccidents) {
		this.roadId=roadId;
		this.signalduration=signalduration;
		this.timeofcongestion=timeofcongestion;
		this.nofaccidents=nofaccidents;

		this.roadname=roadname;


	}

	public int getRoadId() {
		return roadId;
	}

	public void setRoadId(int roadId) {
		this.roadId = roadId;
	}

	public int getNoOfLanes() {
		return noOfLanes;
	}

	public void setNoOfLanes(int noOfLanes) {
		this.noOfLanes = noOfLanes;
	}

	public Time getTimeofcongestion() {
		return timeofcongestion;
	}

	

	
	public Time getSignalduration() {
		return signalduration;
	}

	public void setSignalduration(Time signalduration) {
		this.signalduration = signalduration;
	}

	public int getNofaccidents() {
		return nofaccidents;
	}

	public void setNofaccidents(int nofaccidents) {
		this.nofaccidents = nofaccidents;
	}

	public int getTotalCars() {
		return totalCars;
	}

	public void setTotalCars(int totalCars) {
		this.totalCars = totalCars;
	}

	public int getTotalLanes() {
		return totalLanes;
	}

	public void setTotalLanes(int totalLanes) {
		this.totalLanes = totalLanes;
	}

}






