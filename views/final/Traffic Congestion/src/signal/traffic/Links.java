package signal.traffic;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name="Links1")
public class Links {

	@OneToOne
	@PrimaryKeyJoinColumn
	private RoadCongestion roadid;
	@Column(name="roadname")
	private String roadname;
	
	@Id
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
	@PrimaryKeyJoinColumn
	private RoadCongestion segmentid;
	public RoadCongestion getRoadid() {
		return roadid;
	}
	public void setRoadid(RoadCongestion roadid) {
		this.roadid = roadid;
	}
	public String getRoadname() {
		return roadname;
	}
	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}
	public RoadCongestion getSegmentid() {
		return segmentid;
	}
	public void setSegmentid(RoadCongestion segmentid) {
		this.segmentid = segmentid;
	}
	public String getSegmentname() {
		return segmentname;
	}
	public void setSegmentname(String segmentname) {
		this.segmentname = segmentname;
	}
	@Column(name="segmentname")
	private String segmentname;
}
