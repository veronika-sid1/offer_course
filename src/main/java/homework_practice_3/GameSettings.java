package homework_practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public static void main(String[] args) {
        GameSettings.maxPlayers = 25;
        GameSettings game1 = new GameSettings("Футбол", 15);
        GameSettings game2 = new GameSettings("Хоккей", 18);
        game1.printGameStatus();
        game2.printGameStatus();
        GameSettings.setMaxPlayers(20);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    int addPlayer() {
        if (currentPlayers < GameSettings.maxPlayers) {
            return currentPlayers += 1;
        }
        System.out.println("Количество игроков команды " + this.gameName + " достигло максимума");
        return currentPlayers;
    }

    void printGameStatus() {
        System.out.println("Название команды: " + this.gameName + " Текущее количество: " + this.currentPlayers + " Максимальное количество: " + GameSettings.maxPlayers);
    }
}
