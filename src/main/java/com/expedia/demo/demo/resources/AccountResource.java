/**
 * 
 */
package com.expedia.demo.demo.resources;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author avishnoi
 *
 */
@RestController

public class AccountResource {

	AtomicLong count = new AtomicLong(0);
	
	@RequestMapping("/getCount")
	public String getRequestNumber() {
		return "Hello this is a test string, I can publish anything from here in any format."
				+ "This is my request No. " + count.addAndGet(1);
	}
}
