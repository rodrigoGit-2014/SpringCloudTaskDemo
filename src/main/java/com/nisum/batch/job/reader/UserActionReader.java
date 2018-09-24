package com.nisum.batch.job.reader;

import com.nisum.batch.model.UserActionModel;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.core.io.ClassPathResource;

public class UserActionReader implements ItemReader<FlatFileItemReader<UserActionModel>> {

    @Override
    public FlatFileItemReader<UserActionModel> read() throws Exception{
        return new FlatFileItemReaderBuilder<UserActionModel>()
                .name("userActionReader")
                .resource(new ClassPathResource("/files/user_action.dat"))
                .delimited()
                .delimiter(",")
                .names(new String[]{"name", "surname","listenDate","artistName","albumName","songName"})
                .fieldSetMapper(new BeanWrapperFieldSetMapper<UserActionModel>() {{
                    setTargetType(UserActionModel.class);
                }})
                .build();
    }
}
