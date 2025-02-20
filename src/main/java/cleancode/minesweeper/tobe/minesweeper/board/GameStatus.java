package cleancode.minesweeper.tobe.minesweeper.board;

public enum GameStatus {
    
    IN_PROGRESS("진행 중"),
    WIN("승리"),
    LOST("패배"),
    ;
    
    private final String description;

    GameStatus(String description) {
        this.description = description;
    }
}
