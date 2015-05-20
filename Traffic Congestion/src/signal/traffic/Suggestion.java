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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import java.sql.Time;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.UniqueConstraint;


@Entity
@Table(name="suggestion")
public class Suggestion {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "suggestionid", unique = true, nullable = false)
    private int suggestionId;

	@ManyToOne
    @JoinColumn(name="department_id")
	private RoadCongestion road;
	
	public int getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(int suggestionId) {
		this.suggestionId = suggestionId;
	}

	public RoadCongestion getRoad() {
		return road;
	}

	public void setRoad(RoadCongestion road) {
		this.road = road;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Handle getHandle_sug() {
		return handle_sug;
	}

	public void setHandle_sug(Handle handle_sug) {
		this.handle_sug = handle_sug;
	}

	@Column(name="descriptions")
	private String description;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Handle handle_sug;
}
