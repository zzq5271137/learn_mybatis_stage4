package com.mycomp.mybatis.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QueryVo {

    private Integer[] voIdsArr;
    private List<Integer> voIdsList;

}
