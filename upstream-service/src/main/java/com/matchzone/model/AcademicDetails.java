package com.matchzone.model;

public class AcademicDetails 
{

	private String profileId;
	private String education;
	private String course;
	private String specialisation;
	private String universityInstitute;
	private Integer passingYear;
	private String gradingSystem;
	private String higherSecondary;
	private Integer highDuration;
	private String highLocation;
	private String seniorSecondary;
	private Integer senDuration;
	private String senLocation;

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public String getUniversityInstitute() {
		return universityInstitute;
	}

	public void setUniversityInstitute(String universityInstitute) {
		this.universityInstitute = universityInstitute;
	}

	public String getGradingSystem() {
		return gradingSystem;
	}

	public void setGradingSystem(String gradingSystem) {
		this.gradingSystem = gradingSystem;
	}

	public String getHigherSecondary() {
		return higherSecondary;
	}

	public void setHigherSecondary(String higherSecondary) {
		this.higherSecondary = higherSecondary;
	}

	public String getHighLocation() {
		return highLocation;
	}

	public void setHighLocation(String highLocation) {
		this.highLocation = highLocation;
	}

	public String getSeniorSecondary() {
		return seniorSecondary;
	}

	public void setSeniorSecondary(String seniorSecondary) {
		this.seniorSecondary = seniorSecondary;
	}

	public Integer getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(Integer passingYear) {
		this.passingYear = passingYear;
	}

	public Integer getHighDuration() {
		return highDuration;
	}

	public void setHighDuration(Integer highDuration) {
		this.highDuration = highDuration;
	}

	public Integer getSenDuration() {
		return senDuration;
	}

	public void setSenDuration(Integer senDuration) {
		this.senDuration = senDuration;
	}

	public String getSenLocation() {
		return senLocation;
	}

	public void setSenLocation(String senLocation) {
		this.senLocation = senLocation;
	}

	public AcademicDetails(String profileId, String education, String course, String specialisation, String universityInstitute,
			Integer passingYear, String gradingSystem, String higherSecondary, Integer highDuration,
			String highLocation, String seniorSecondary, Integer senDuration, String senLocation) {
		super();
		this.profileId = profileId;
		this.education = education;
		this.course = course;
		this.specialisation = specialisation;
		this.universityInstitute = universityInstitute;
		this.passingYear = passingYear;
		this.gradingSystem = gradingSystem;
		this.higherSecondary = higherSecondary;
		this.highDuration = highDuration;
		this.highLocation = highLocation;
		this.seniorSecondary = seniorSecondary;
		this.senDuration = senDuration;
		this.senLocation = senLocation;
	}

	public AcademicDetails() {
		super();
	}

}
