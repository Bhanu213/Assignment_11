package org.antwalk.dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.model.Agents;



public interface AgentDao {
	public void setDataSource(DataSource ds);

	public void create(String agentName, String workingArea, String mobileNumber, String country);

	public List<Agents> listBook();
}
