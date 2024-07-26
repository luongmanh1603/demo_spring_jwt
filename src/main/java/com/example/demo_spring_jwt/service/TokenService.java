package com.example.demo_spring_jwt.service;

import com.example.demo_spring_jwt.payload.Token;
import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;


import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class TokenService {
    JwtEncoder jwtEncoder;

    public TokenService(JwtEncoder encoder) {
        this.jwtEncoder = encoder;
    }

    public String generateToken(Authentication authentication) {
        Instant now = Instant.now();
        String scope = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(""));
        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("T2210A")
                .issuedAt(now)
                .expiresAt(now.plus(30, ChronoUnit.SECONDS))
                .subject(authentication.getName())
                .claim("scope", scope)
                .claim("email", "manhluong160@gmail.com")
                .build();

        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }
}
