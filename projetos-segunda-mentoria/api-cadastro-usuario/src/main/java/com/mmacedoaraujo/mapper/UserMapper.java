package com.mmacedoaraujo.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.mmacedoaraujo.domain.User;
import org.mapstruct.factory.Mappers;

public interface UserMapper {

    public static UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

}
