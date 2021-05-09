package com.orm.mappings;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COLLEGE_INFO")
public class College {			 // college collegedept  collegeaddress	address		--> 4
		@Id
		private int collegeId;
		private String collegeName;
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinTable(
		        name = "COLLEGE_DEPT",
		        joinColumns = @JoinColumn(
		                name = "COLL_ID",unique = false,
		                referencedColumnName = "collegeId"
		        ),
		        inverseJoinColumns = @JoinColumn(
		                name = "DEPT_ID",unique = true,
		                referencedColumnName = "deptCode"
		        )
		)
		private List<Dept> departments;		 // cid  did -->  101 101		1 2
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinTable(
		        name = "COLLEGE_ADDRESS",
		        joinColumns = @JoinColumn(
		                name = "COLL_ID",unique = true,
		                referencedColumnName = "collegeId"
		        ),
		        inverseJoinColumns = @JoinColumn(
		                name = "AID",unique = true,
		                referencedColumnName = "adrId"
		        )
		)
		private Address address;

		public College(int collegeId, String collegeName, List<Dept> departments, Address address) {
			super();
			this.collegeId = collegeId;
			this.collegeName = collegeName;
			this.departments = departments;
			this.address = address;
		}

		public College() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getCollegeId() {
			return collegeId;
		}

		public void setCollegeId(int collegeId) {
			this.collegeId = collegeId;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		public List<Dept> getDepartments() {
			return departments;
		}

		public void setDepartments(List<Dept> departments) {
			this.departments = departments;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "\n [collegeId=" + collegeId + ", collegeName=" + collegeName + ", departments=" + departments
					+ ", address=" + address + "]";
		}
		
		
		
		
}
