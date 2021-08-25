package com.example.apirest.config;

import org.hibernate.envers.RevisionListener;

import com.example.apirest.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
	
	public void newRevision(Object revisionEntity) {
		
		final Revision revision = (Revision) revisionEntity;
		
		
	}
	

}
