package com.bridgelabz.fundoo.utility;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;

@Component
public class TokenUtility 
{
	public static String secrt_Key = "Nilam@123";

	public String generateToken(String id) 
	{			 
		Algorithm algorithm = Algorithm.HMAC256(secrt_Key);
		String token = JWT.create().withClaim("Happy", id).sign(algorithm);
		return token;
	}
	public String verifyToken(String token) 
	{
		String id;
		Verification verification = JWT.require(Algorithm.HMAC256(secrt_Key));
		JWTVerifier jwtVerifier = verification.build();
		DecodedJWT decodedJWT = jwtVerifier.verify(token);
		Claim claim = decodedJWT.getClaim("Happy");
		id = claim.asString();
		
		return id;
	}
}