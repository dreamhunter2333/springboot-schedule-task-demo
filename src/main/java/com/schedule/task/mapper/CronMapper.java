package com.schedule.task.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CronMapper {
    @Select("select cron from cron limit 1")
    String getCron();
}
