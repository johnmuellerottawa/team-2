/*
 * DOSBox, Scrum.org, Professional Scrum Developer Training
 * Authors: Rainer Grau, Daniel Tobler, Zuehlke Technology Group
 * Copyright (c) 2013 All Right Reserved
 */ 

package command.library;

import java.util.ArrayList;
import interfaces.IDrive;
import interfaces.IOutputter;
import command.framework.Command;
import filesystem.Directory;
import filesystem.FileSystemItem;

class CmdVer extends Command {
	private static final String APP_NAME = "DOS-BOX"; 
    private static final String VERSION = "[v0.0.0001]";
    private static final String DEVELOPERS = "Contributors: Armon, Amine, Rashin, Susana, Michael";

    public CmdVer(String name, IDrive drive) {
        super(name, drive);
    }

    @Override
    protected boolean checkNumberOfParameters(int numberOfParameters) {
        return numberOfParameters == 0 || numberOfParameters == 1;
    }

    @Override
    public void execute(IOutputter outputter) {
        outputter.printLine(APP_NAME + " " + VERSION);
        outputter.printLine(DEVELOPERS);
        outputter.newLine();
    }
}