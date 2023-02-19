package org.antwalk.dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.model.Agents;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDaoImpl implements AgentDao {
	private DataSource dataSource;
	private JdbcTemplate jbdbcTemplateObj;
	
	
	public void setDataSource(DataSource ds)
	{
		this.dataSource=ds;   //Initializing Connection
		this.jbdbcTemplateObj=new JdbcTemplate(dataSource);
	}
	public List<Agents>listBook()
	{
		String query="select * from agents";
		List<Agents> books=jbdbcTemplateObj.query(query, new AgentMapper());
		return books;
	}
	public void create(String agentName, String workingArea, String mobileNumber, String country) {
		try {
			String query="insert into agents(name,workingarea,mobile,country) values(?,?,?,?)";
			jbdbcTemplateObj.update(query,new Object[] {agentName,workingArea,mobileNumber,country});
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
	}
}