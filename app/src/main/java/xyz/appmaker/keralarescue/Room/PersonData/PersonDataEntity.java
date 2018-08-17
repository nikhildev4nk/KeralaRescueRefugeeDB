package xyz.appmaker.keralarescue.Room.PersonData;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "person_data")
public class PersonDataEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "camp_id")
    public String campId;

    @ColumnInfo(name = "age")
    public String age;

    @ColumnInfo(name = "gender")
    public String gender;

    @ColumnInfo(name = "address")
    public String address;

    @ColumnInfo(name = "district")
    public String district;

    @ColumnInfo(name = "mobile")
    public String mobile;

    @ColumnInfo(name = "note")
    public String note;

    public PersonDataEntity() {
    }

    public PersonDataEntity(String name, String campName, String age, String gender, String address, String district, String mobile, String note) {
        this.name = name;
        this.campId = campName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.district = district;
        this.mobile = mobile;
        this.note = note;

    }


}
