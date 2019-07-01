package com.technos.mochisrin.moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int photo;
    private String name;
    private String date;
    private String description;
    private int actor1;
    private int actor2;
    private int actor3;

    private String nameActor1;
    private String nameActor2;
    private String nameActor3;

    public String getNameActor1() {
        return nameActor1;
    }

    public void setNameActor1(String nameActor1) {
        this.nameActor1 = nameActor1;
    }

    public String getNameActor2() {
        return nameActor2;
    }

    public void setNameActor2(String nameActor2) {
        this.nameActor2 = nameActor2;
    }

    public String getNameActor3() {
        return nameActor3;
    }

    public void setNameActor3(String nameActor3) {
        this.nameActor3 = nameActor3;
    }

    public String getDirector1() {
        return director1;
    }

    public void setDirector1(String director1) {
        this.director1 = director1;
    }

    public String getDirector2() {
        return director2;
    }

    public void setDirector2(String director2) {
        this.director2 = director2;
    }

    public String getScreenplay1() {
        return screenplay1;
    }

    public void setScreenplay1(String screenplay1) {
        this.screenplay1 = screenplay1;
    }

    public String getScreenplay2() {
        return screenplay2;
    }

    public void setScreenplay2(String screenplay2) {
        this.screenplay2 = screenplay2;
    }

    public static Creator<Movie> getCREATOR() {
        return CREATOR;
    }

    private  String director1;
    private  String director2;

    private  String screenplay1;
    private  String screenplay2;


    public int getActor1() {
        return actor1;
    }

    public void setActor1(int actor1) {
        this.actor1 = actor1;
    }

    public int getActor2() {
        return actor2;
    }

    public void setActor2(int actor2) {
        this.actor2 = actor2;
    }

    public int getActor3() {
        return actor3;
    }

    public void setActor3(int actor3) {
        this.actor3 = actor3;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Movie() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.name);
        dest.writeString(this.date);
        dest.writeString(this.description);
        dest.writeInt(this.actor1);
        dest.writeInt(this.actor2);
        dest.writeInt(this.actor3);

        dest.writeString(this.nameActor1);
        dest.writeString(this.nameActor2);
        dest.writeString(this.nameActor3);

        dest.writeString(this.director1);
        dest.writeString(this.director2);

        dest.writeString(this.screenplay1);
        dest.writeString(this.screenplay2);

    }

    protected Movie(Parcel in) {
        this.photo = in.readInt();
        this.name = in.readString();
        this.date = in.readString();
        this.description = in.readString();
        this.actor1 = in.readInt();
        this.actor2 = in.readInt();
        this.actor3 = in.readInt();

        this.nameActor1 = in.readString();
        this.nameActor2 = in.readString();
        this.nameActor3 = in.readString();

        this.director1 = in.readString();
        this.director2 = in.readString();

        this.screenplay1 = in.readString();
        this.screenplay2 = in.readString();

    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
