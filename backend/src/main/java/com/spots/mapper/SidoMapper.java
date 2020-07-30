package com.spots.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spots.dto.SidoInfo;


@Mapper
public interface SidoMapper {

	List<SidoInfo> cityList();

	List<SidoInfo> stateList(String city_code);

	List<SidoInfo> dongList(String state_code);


}