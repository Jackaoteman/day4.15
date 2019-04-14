package com.itliyue.domain;

public class User2 {
    private Integer useID;
    private  String  userName;
    private  String  userBirthday;
    private  String  userSex;
    private   String userAddress;

    @Override
    public String toString() {
        return "User2{" +
                "useID=" + useID +
                ", userName='" + userName + '\'' +
                ", userBirthday='" + userBirthday + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }


    public Integer getUseID() {
        return useID;
    }


    public void setUseID(Integer useID) {
        this.useID = useID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
