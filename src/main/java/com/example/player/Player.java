// Write your code here.
package com.example.player;
public class Player{ 
       int playerId;
        String playerName;
        int jerseyNumber;
        String role;
        public Player(int playerId,String playerName,int jerseyNumber,String role){
            this.playerId=playerId;
            this.playerName = playerName;
            this.jerseyNumber=jerseyNumber;
            this.role=role;

        }
        public int getPlayerId(){
            return playerId;
        }
        public void setPlayerId(int id){
            this.playerId = id;
        }
        public void setPlayerName(String playerName){
            this.playerName=playerName;
        }
        public String getPlayerName(){
            return playerName;
        }
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
        public int getJerseyNumber(){
            return jerseyNumber;
        }
        public void setRole(String role){
            this.role=role;
        }
        public String getRole(){
            return role;
        }

}