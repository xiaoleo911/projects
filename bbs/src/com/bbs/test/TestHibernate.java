package com.bbs.test;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestHibernate {


	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("/hibernate.cfg.xml");
		SchemaExport dbExport = new SchemaExport(conf);
		dbExport.create(true, true);

	}
}