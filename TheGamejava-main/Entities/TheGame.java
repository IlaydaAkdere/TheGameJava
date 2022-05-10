package Entities;

public class TheGame {

    private int id;
    private String GameName;
    private String GameType;
    private double GamePrice;
    private String GameDescription;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGameName() {
        return GameName;
    }
    public void setGameName(String GameName) {
        this.GameName = GameName;
    }
    public String getGameType() {
        return GameType;
    }
    public void setGameType(String GameType) {
        this.GameType = GameType;
    }
    public double getGamePrice() {
        return GamePrice;
    }
    public void setGamePrice(double GamePrice) {
        this.GamePrice = GamePrice;
    }
    public String getGameDescription() {
        return GameDescription;
    }
    public void setGameDescription(String GameDescription) {
        this.GameDescription = GameDescription;
    }

    
}
