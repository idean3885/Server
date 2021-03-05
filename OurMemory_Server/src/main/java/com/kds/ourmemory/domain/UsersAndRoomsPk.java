package com.kds.ourmemory.domain;

import java.io.Serializable;

import com.kds.ourmemory.domain.room.Rooms;
import com.kds.ourmemory.domain.user.Users;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsersAndRoomsPk implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Users user;
    private Rooms room;
}
