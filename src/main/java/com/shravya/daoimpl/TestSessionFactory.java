package com.shravya.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TestSessionFactory
{
@Autowired
SessionFactory sessionFactory;
public void testingSessionFactory()
{
	System.out.println(sessionFactory);
}
}
