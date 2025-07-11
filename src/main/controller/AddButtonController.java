package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXNodesList;
import javafx.fxml.FXML;
import model.Project;
import model.Task;
import ui.AddTask;
import ui.PomoTodoApp;
import utility.Logger;

// Controller class for AddButton UI
public class AddButtonController {
    @FXML
    private JFXNodesList nodesList;
    @FXML
    private JFXButton newButton;
    @FXML
    private JFXButton addTaskButton;
    @FXML
    private JFXButton addProjectButton;
    
    // EFFECTS: Open the "Add new task" UI
    @FXML
    public void onNewTask() {
        Logger.log("AddButtonController", "Add new task.");
        closeNodeList();
        PomoTodoApp.setScene(new AddTask());
    }
    
    // EFFECTS: Open the "Add new project" UI
    @FXML
    public void onNewProjectORIGINAL() {
        Logger.log("AddButtonController", "Adding project is not supported in this version.");
        //  Try add new project
        closeNodeList();

    }

    @FXML
    public void onNewProject() {
        Logger.log("AddButtonController", "Adding new project.");
        closeNodeList();

        Project newProject = new Project("New Project");
        //PomoTodoApp.getTasks().add(newProject);  //
    }


    // EFFECTS: closes the node list
    private void closeNodeList() {
        nodesList.animateList(false);
    }
}
