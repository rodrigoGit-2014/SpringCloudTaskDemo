package com.nisum.batch.job.writer;

import com.nisum.batch.model.UserActionModel;
import org.apache.ibatis.session.SqlSession;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserActionWriter implements ItemWriter<UserActionModel> {

    @Autowired
    private SqlSession sqlSession;


    @Override
    public void write(List<? extends UserActionModel> userAction) throws Exception {
        sqlSession.insert("insertUserAction", userAction);
    }

}
