package us.christopherwmurphy.jsondeserialize;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import us.christopherwmurphy.dto.FeatureRequest;

@JsonTest
@RunWith(SpringRunner.class)
public class FeatureRequestDeserializeTest {
	
    @Autowired
    private ObjectMapper objectMapper;
	
    @Test
    public void testDeserializeFeatureRequest() {
    	String json = "{\"id\": 1, \"title\":\"Feature Request\", \"description\":\"This is a feature request test.\", \"client\":1, \"priority\":1, \"targetDate\": \"2007-12-03\", \"productArea\": 1}";
    	
    	FeatureRequest request = null;
    	try {
			request = objectMapper.readValue(json, FeatureRequest.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	assertEquals(new Integer(1),request.getClient());
    }
}
