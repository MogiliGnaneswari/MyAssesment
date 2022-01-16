package com.gnaneswari.mogili;

import com.gnaneswari.mogili.FileOperations;
import com.gnaneswari.mogili.HandleOption;
import com.gnaneswari.mogili.menuOption;

public class LockedMeMain {
public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		menuOption.printWelcomeScreen("Locker", "gnaneswari");
		
		HandleOption.handleWelcomeScreenInput();
	}

}
