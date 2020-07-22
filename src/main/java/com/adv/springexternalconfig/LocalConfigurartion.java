package com.adv.springexternalconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Dilip Upadhyay
 *
 */
@Profile("local")
@Configuration
public class LocalConfigurartion {

	private final Logger LOGGER = LoggerFactory.getLogger(LocalConfigurartion.class);

	@Bean( name = "pojo2")
	SomePojo getSoething() {
		LOGGER.info("========= local profile config");
		return new SomePojo();
	}

}
