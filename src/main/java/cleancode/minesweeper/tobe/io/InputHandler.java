package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.position.CellPosition;

public interface InputHandler {
    String getUserInput();

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();
}
