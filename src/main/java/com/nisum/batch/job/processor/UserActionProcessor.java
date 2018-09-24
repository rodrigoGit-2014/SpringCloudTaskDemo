package com.nisum.batch.job.processor;

import com.nisum.batch.model.UserActionModel;
import org.springframework.batch.item.ItemProcessor;

import java.util.Calendar;
import java.util.Date;

public class UserActionProcessor implements ItemProcessor<UserActionModel,UserActionModel> {


    @Override
    public UserActionModel process(UserActionModel userActionModel) throws Exception {
        final String firstName = userActionModel.getName().toUpperCase();
        final String secondName = userActionModel.getSongName().toUpperCase();
        final Date date = Calendar.getInstance().getTime();
        final String artist = userActionModel.getArtistName().toUpperCase();
        final String album = userActionModel.getAlbumName().toUpperCase();
        final String song = userActionModel.getSongName().toUpperCase();

        final UserActionModel user = new UserActionModel(firstName,secondName,date,artist,album,song);

        return user;
    }
}
