package com.example.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {
    private String name, hp, attack, def, sp_att, sp_def, speed, image, thumbnail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getSp_att() {
        return sp_att;
    }

    public void setSp_att(String sp_att) {
        this.sp_att = sp_att;
    }

    public String getSp_def() {
        return sp_def;
    }

    public void setSp_def(String sp_def) {
        this.sp_def = sp_def;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.hp);
        dest.writeString(this.attack);
        dest.writeString(this.def);
        dest.writeString(this.sp_att);
        dest.writeString(this.sp_def);
        dest.writeString(this.speed);
        dest.writeString(this.image);
        dest.writeString(this.thumbnail);
    }

    public Pokemon() {
    }
    protected Pokemon(Parcel in) {
        this.name = in.readString();
        this.hp = in.readString();
        this.attack = in.readString();
        this.def = in.readString();
        this.sp_att = in.readString();
        this.sp_def = in.readString();
        this.speed = in.readString();
        this.image = in.readString();
        this.thumbnail = in.readString();
    }
    public static final Parcelable.Creator<Pokemon> CREATOR = new Parcelable.Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel source) {
            return new Pokemon(source);
        }
        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };
}