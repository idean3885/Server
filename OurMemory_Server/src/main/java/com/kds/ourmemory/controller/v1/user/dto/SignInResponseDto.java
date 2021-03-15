package com.kds.ourmemory.controller.v1.user.dto;

import org.springframework.beans.BeanUtils;

import com.kds.ourmemory.entity.user.User;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInResponseDto {
    @ApiModelProperty(value="사용자 번호", example = "49")
    private Long id;
    
    @ApiModelProperty(value="사용자 이름", example = "김동영")
    private String name;
    
    @ApiModelProperty(value="사용자 생일", example = "null")
    private String birthday;
    
    @ApiModelProperty(value="양력 여부", example = "false")
    private boolean isSolar;
    
    @ApiModelProperty(value="생일 공개여부", example = "false")
    private boolean isBirthdayOpen;
    
    public SignInResponseDto(User user) {
        BeanUtils.copyProperties(user, this);
    }
}