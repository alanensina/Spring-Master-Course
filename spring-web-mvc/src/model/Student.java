package model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> languageOptions;
    private LinkedHashMap<String, String> operatingSystemsOptions;
    
    public Student() {
    	populateOptions();
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}
	
	public void populateOptions() {
		countryOptions = new LinkedHashMap<>();
    	countryOptions.put("BR", "Brazil");
    	countryOptions.put("CA", "Canada");
    	countryOptions.put("US", "United States of America");
    	countryOptions.put("IR", "Ireland");
    	countryOptions.put("FR", "France");
    	
    	languageOptions = new LinkedHashMap<>();
    	languageOptions.put("Java", "Java");
    	languageOptions.put("C#", "C#");
    	languageOptions.put("Python", "Python");
    	languageOptions.put("JavaScript", "JavaScript");
    	languageOptions.put("Go", "Go");   
    	
    	operatingSystemsOptions = new LinkedHashMap<>();
    	operatingSystemsOptions.put("Linux", "Linux");
    	operatingSystemsOptions.put("Windows", "Windows");
    	operatingSystemsOptions.put("MacOS", "MacOS");
	}
}
