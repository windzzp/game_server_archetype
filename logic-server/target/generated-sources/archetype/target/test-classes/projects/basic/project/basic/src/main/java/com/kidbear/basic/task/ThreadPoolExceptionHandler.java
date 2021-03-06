package com.kidbear.basic.task;

import java.lang.Thread.UncaughtExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadPoolExceptionHandler implements UncaughtExceptionHandler {
	private Logger logger = LoggerFactory
			.getLogger(ThreadPoolExceptionHandler.class);

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		logger.error(t.getName(), e);
	}

}
