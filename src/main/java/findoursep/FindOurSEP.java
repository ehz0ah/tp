package findoursep;

import studentlist.StudentList;
import ui.UI;
import parser.Parser;

public class FindOurSEP {
    private UI ui;
    private Parser parser;
    private StudentList studentList;

    /**
     * Constructs a new Duke object.
     * This constructor initializes the Duke's UI and parser.
     */
    public FindOurSEP() {
        this.ui = new UI();
        this.studentList = new StudentList(this.ui);
        this.parser = new Parser(this.studentList,this.ui);
    }

    public void start() {
        this.ui.sayHi();
        String line;
        boolean isRunning = true;
        while (isRunning) {
            line = this.ui.getUserInput();
            isRunning = this.parser.parseInput(line);
        }
    }
    
    /**
     * Main entry-point for the findoursep.FindOurSEP application.
     */
    public static void main(String[] args) {
        FindOurSEP bob = new FindOurSEP();
        bob.start();
    }
}
