package com.cck;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 公开日记用户信息
 * @author cck
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OpenDirayUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String avator;
}
