package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.ArrayList;

public class TodoList {
    private String title;
    private ArrayList<task> tasks;

    public TodoList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    private String addItem()
    {
        //Function will receive the necessary information to create a new item
        //A new temporary item will be created and added onto the Array of task

        //Description will be returned
        return null;
    }

    private String removeItem()
    {
        //Find the item in the Array of tasks
        //The first word of the item to delete will be held in a temp variable
        //Delete the item from the Array of tasks

        //Return description
        return null;
    }

    private String editItemDesc()
    {
        //Get the item to update from the array
        //Get the new description from the user
        //Update the item's description with the new one using setters of task class

        //Return new description
        return null;
    }

    private String editItemDueDate()
    {
        //Get the item to update from the array
        //Get the new due Date from the user
        //Update the item's Due Date with the new one using setters of "task" class

        //Return new dueDate
        return null;
    }


    private boolean changeStatus()
    {
        //Get the task to be updated
        //Check if task status is not "Complete"
        //Change status to complete

        //Return task status
        return true;
    }

    private ArrayList<task> getCompleted()
    {
        //Will create an array list holding only the tasks which are completed
        //In order for it to be displayed in the app controller

        //Return the new Array list
        return null;
    }

    private ArrayList<task> getActive()
    {
        //Will create an array list holding only the tasks which are Active
        //In order for it to be displayed in the app controller

        //Return the new Array list
        return null;
    }

    private void exportTask()
    {
        //Turn the array into a csv file
        //Put the file onto a user specified folder
    }

    private void inportList()
    {
        //Get the data from a user specified csv file
        //Parse the data as items
        //Put the items into the current list
    }

    //******getters and setters*******//
    public ArrayList<task> getTasks() {
        return tasks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
