package idhamramadito.jwork;

/**
 * Write a description of enum JobCategory here.
 *
 * @author Idham Ramadito
 * @version Modul 3, 25 Maret 2021
 */

public enum JobCategory 
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    private String category;
    
    JobCategory(String category)
    {
        this.category = category;
    }
    
    public String toString()
    {
        return category;
    }
}
