package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ernesto Santos
 */

public class task {
    private String description;
    private boolean status;
    private String dueDate;

    public task(String description, String dueDate) {
        this.description = description;
        this.status = true;
        this.dueDate = formatDate(dueDate);
    }

    private String formatDate(String unFormatted)
    {
        //Format the provided date to the desired format mm/dd/yyyy

        //Return Formatted date
        return null;
    }


    //*******Getters and Setters**********//

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}
