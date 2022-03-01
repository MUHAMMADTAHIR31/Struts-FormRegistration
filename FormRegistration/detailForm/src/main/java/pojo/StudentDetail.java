/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class StudentDetail extends ActionSupport {
    
    private String firstName;
    private String lastName;
    
    private String password;
    private String rePassword;
    
    private String yourGender;
    private String yourCountry;
    private String yourLanguage;
    
    private String rightItems;
    private String leftItems;

    private List<String> languages;
    private List<String> genders;
    private List<String> country;
    
    
    private String remarks;
    private String fvt;

    public String getRightItems() {
        return rightItems;
    }

    public void setRightItems(String rightItems) {
        this.rightItems = rightItems;
    }

    public String getLeftItems() {
        return leftItems;
    }

    public void setLeftItems(String leftItems) {
        this.leftItems = leftItems;
    }
    
    public String getYourGender() {
        return yourGender;
    }

    public void setYourGender(String yourGender) {
        this.yourGender = yourGender;
    }

    public String getYourCountry() {
        return yourCountry;
    }

    public void setYourCountry(String yourCountry) {
        this.yourCountry = yourCountry;
    }

    public String getYourLanguage() {
        return yourLanguage;
    }

    public void setYourLanguage(String yourLanguage) {
        this.yourLanguage = yourLanguage;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }
        
    public StudentDetail(){
	
        languages = new ArrayList<>();
	languages.add("Sindhi");
	languages.add("Urdu");
	languages.add("English");
	languages.add("other");
        
        
        country = new ArrayList<>();
	country.add("Pakistan");
	country.add("China");
	country.add("India");
	country.add("UK");
	country.add("USA");
	country.add("Turkey");
	country.add("Iran");
	country.add("others");
        
        genders = new ArrayList<String>();
	genders.add("Male");
	genders.add("Female");
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
        

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

   
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFvt() {
        return fvt;
    }

    public void setFvt(String fvt) {
        this.fvt = fvt;
    }
    
    @Override
    public String execute(){  
        return "success";  
    } 
    
    public String display() {
        return NONE;
    }    
}
