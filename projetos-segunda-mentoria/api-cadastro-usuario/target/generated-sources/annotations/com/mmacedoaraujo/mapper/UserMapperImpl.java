package com.mmacedoaraujo.mapper;

import com.mmacedoaraujo.domain.User;
import com.mmacedoaraujo.dto.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-18T13:08:30-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public void update(User user, UserDTO userDTO) {
        if ( userDTO == null ) {
            return;
        }

        if ( userDTO.getName() != null ) {
            user.setName( userDTO.getName() );
        }
        if ( userDTO.getBirthDate() != null ) {
            user.setBirthDate( userDTO.getBirthDate() );
        }
        if ( userDTO.getCpf() != null ) {
            user.setCpf( userDTO.getCpf() );
        }
        if ( userDTO.getStreet() != null ) {
            user.setStreet( userDTO.getStreet() );
        }
        if ( userDTO.getCity() != null ) {
            user.setCity( userDTO.getCity() );
        }
        if ( userDTO.getState() != null ) {
            user.setState( userDTO.getState() );
        }
        if ( userDTO.getCep() != null ) {
            user.setCep( userDTO.getCep() );
        }
        if ( userDTO.getPhoneNumber() != null ) {
            user.setPhoneNumber( userDTO.getPhoneNumber() );
        }
        if ( userDTO.getEmail() != null ) {
            user.setEmail( userDTO.getEmail() );
        }
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( userDTO.getName() );
        user.birthDate( userDTO.getBirthDate() );
        user.cpf( userDTO.getCpf() );
        user.street( userDTO.getStreet() );
        user.city( userDTO.getCity() );
        user.state( userDTO.getState() );
        user.cep( userDTO.getCep() );
        user.phoneNumber( userDTO.getPhoneNumber() );
        user.email( userDTO.getEmail() );

        return user.build();
    }
}
