package com.example.lab.app;

import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTParser;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Base64;
import java.util.Map;

@SpringBootTest
class AppDemoLoadApplicationTests {

	@SneakyThrows
    @Test
	void contextLoads() {
        // Token JWT de exemplo
        String jwtToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJINlBkVmtvcFlPVXRrVmxqTmYyeEtxdXV3OXFybDFOWUt4N0xRLTNsSm13In0.eyJleHAiOjE3MDY5MTc0NzMsImlhdCI6MTcwNjkxNzE3MywianRpIjoiMDE2YjAzNWQtMjJkYi00ZDNiLWFlN2EtODBiZGY2NzgzMjcxIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo3MDgxL3JlYWxtcy9kZW1vIiwic3ViIjoiZjY4MTdkOGItNmZmNC00NDMwLTgyNzMtZDBhMzBjMzVkMGY3IiwidHlwIjoiQmVhcmVyIiwiYXpwIjoic3ByaW5nYm9vdC1taWNyb3NlcnZpY2UiLCJzZXNzaW9uX3N0YXRlIjoiY2E5MDBhOTEtYjI1ZS00M2Q2LTlhNTMtY2NiNDlhMGJlZTZlIiwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiY2E5MDBhOTEtYjI1ZS00M2Q2LTlhNTMtY2NiNDlhMGJlZTZlIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsInByZWZlcnJlZF91c2VybmFtZSI6InRlc3RlIn0.b9ZLzWqnEXQBMZ1z8su3J6G105nVWJ-_iFYZgsgjB7mz1PvULgYnPMH9t_-jiO_6l2PGRJJy2-ZDdQDgfwFpdmQpgqyKsEAEK-DarZ6Zpe9604u8gStP5NToS5_kIgSC1_nkl3qZ4uhNa_BoXGODGZdeSit199rXefgmpt8prD0UvXuWkOTCySeQljeKoy-fAPfhRWZH1zwpyOHUL2m34csTNVn_qamVmI5kfWexxvRbjKksV1xxmW4MvRECqO4aw3UJRqbV0LYcFRVoIko8RT3HhUVF1A1CIYHstLUjzcRYnJsxVYXO2TRrjdkUrxyIeYGJoD1rf-DsWU2n-ERUOA";

        System.out.println("------------ Decode JWT ------------");
        String[] split_string = jwtToken.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        String base64EncodedSignature = split_string[2];

        System.out.println("~~~~~~~~~ JWT Header ~~~~~~~");
        Base64.Decoder decoder = Base64.getDecoder();
        String header = new String(decoder.decode(base64EncodedHeader));
        System.out.println("JWT Header : " + header);


        System.out.println("~~~~~~~~~ JWT Body ~~~~~~~");
        String body = new String(decoder.decode(base64EncodedBody));
        System.out.println("JWT Body : "+body);

        JWT jwt = JWTParser.parse(jwtToken);
        Map<String, Object> claims = jwt.getJWTClaimsSet().getClaims();
        System.out.println(claims);


	}

}
