public class ProjectClass{
    private String name;
    private String description;


    public ProjectClass(String nameInput, String descriptionInput){
        this.name = nameInput;
        this.description = descriptionInput;
    }

    //getters
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    //setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }
}