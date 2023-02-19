package org.antwalk.test;

import java.util.List;

import org.antwalk.dao.AgentDao;

import org.antwalk.model.Agents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		AgentDao agent=(AgentDao)context.getBean("agentDaoImpl");
		System.out.println("Adding Records");
		agent.create("Devaraj","Kolkata","4561237890","India");
		agent.create("Mahesh","cambridge","45612378978","Us");
		agent.create("Shanmukh","Bengaluru","1478523690","India");
		agent.create("Laxman","Chennai","9632587410","India");
		System.out.println("Listing the books:");
		List<Agents>agent1=agent.listBook();
		for(Agents agent2:agent1)
		{
			System.out.println("Id:"+agent2.getAgentId());
			System.out.println("Working Place:"+agent2.getWorkingArea());
			System.out.println("Country:"+agent2.getCountry());
			System.out.println("Mobile:"+agent2.getMobileNumber());
		}
	}

}
