package com.markpiazza.codingexample.model;

public class ToDoItem {

    private Long id;
    private String title;
    private String description;
    private Long dueDate;


    public ToDoItem(){

    }

    /**
     * ToDoItem model
     *
     * @param title item title
     * @param description item description
     * @param dueDate item due date
     */
    public ToDoItem(String title, String description, Long dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDueDate() {
        return dueDate;
    }

    public void setDueDate(Long dueDate) {
        this.dueDate = dueDate;
    }
}
