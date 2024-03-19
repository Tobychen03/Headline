package com.java.pojo.vo;

import lombok.Data;

/**
 * @Author Tianle Chen
 * @Description:
 */

@Data
public class PortalVo {

    private String keyWords;
    private int type = 0;
    private int pageNum = 1;
    private int pageSize = 10;
}
