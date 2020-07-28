package com.spots.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spots.dto.TeamInfo;


@Mapper
public interface TeamMapper {

	public int registTeam(TeamInfo team);

	public int modifyTeam(TeamInfo team);

	public TeamInfo detailTeam(int uid);

	public int deleteTeam(int uid);

	public List<TeamInfo> listTeam();

}
