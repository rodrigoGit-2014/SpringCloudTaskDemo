package com.nisum.batch.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserActionModel {

    private String name;
    private String surname;
    private Date listenDate;
    private String artistName;
    private String albumName;
    private String songName;

    public UserActionModel(String name, String surname, Date date, String artistName, String albumName, String songName) {
        this.name = name;
        this.surname = surname;
        this.listenDate = date;
        this.artistName = artistName;
        this.albumName = albumName;
        this.songName = songName;

    }
}
