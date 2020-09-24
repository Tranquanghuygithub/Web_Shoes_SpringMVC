package com.springmvc.configuration;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
public class PaypalConfig {
	
    private String clientId="AefFvQvIV1E5ipbjcyhUvBHLQ8996SkXzPOkujFKmzEyV7RwDMDuKuKzIqFELMh27vIaNsis4Xda4Qw0";
    private String clientSecret="EDG8kG3_v_DEvaJgkU9OAxu41Ss5lLVRSqCyZWTNb_AqkhbvtwYMGSGXmSkRixk3oa2qupuj6dWFduwB";
    private String mode="sandbox";
    
	@Bean
	public Map<String, String> paypalSdkConfig(){
		Map<String, String> sdkConfig = new HashMap<String, String>();
		sdkConfig.put("mode", mode);
		return sdkConfig;
	}
	
	@Bean
	public OAuthTokenCredential authTokenCredential(){
		return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
	}
	
	@Bean
	public APIContext apiContext() throws PayPalRESTException{
		APIContext apiContext = new APIContext(authTokenCredential().getAccessToken());
		apiContext.setConfigurationMap(paypalSdkConfig());
		return apiContext;
	}
}
