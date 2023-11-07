/**
 * 
 */
package com.nara.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Narasimha Mannepalli
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "JobPost")
public class Post {
	
	private String profile;
	private String desc;
	private int exp;
	private String[] techs;
	

}
