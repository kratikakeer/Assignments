package com.te.mappingonetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GirlFriend {
	@Id
	private int gid;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<BoyFriend> boys;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BoyFriend> getBoys() {
		return boys;
	}

	public void setBoys(List<BoyFriend> boys) {
		this.boys = boys;
	}

	@Override
	public String toString() {
		return "Girl [id=" + gid + ", name=" + name + ", boys=" + boys + "]";
	}



		
	}
	
	


