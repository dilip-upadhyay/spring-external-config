package com.adv.springexternalconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Dilip Upadhyay
 *
 */
@Profile({ "dev", "uat", "prod" })
@org.springframework.context.annotation.Configuration
@PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = false)
public class Configuration {
	private final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);

	@Bean(name = "pojo1")
	SomePojo getSoething() {
		LOGGER.info("========= dev/uat/prod profile config");
		return new SomePojo();
	}

}
