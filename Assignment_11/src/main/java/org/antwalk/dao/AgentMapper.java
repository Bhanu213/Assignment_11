package org.antwalk.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Agents;

import org.springframework.jdbc.core.RowMapper;

public class AgentMapper implements RowMapper<Agents>{

	public Agents mapRow(ResultSet rs, int rowNum) throws SQLException {
		Agents agents = new Agents();
		agents.setAgentId(rs.getInt("id"));
		agents.setAgentName(rs.getString("name"));
		agents.setWorkingArea(rs.getString("workingarea"));
		agents.setCountry(rs.getString("country"));
		agents.setMobileNumber(rs.getString("mobile"));
		return agents;
	}
	
}
