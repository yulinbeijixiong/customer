package com.customer.utils;


import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import net.minidev.json.JSONObject;
import net.sf.cglib.beans.BeanMap;
import org.springframework.security.core.userdetails.UserDetails;

import java.text.ParseException;

/**
 * @author oujian
 * create by 2019/1/25
 */
public class JWTutils {
    /**
     * 创建密钥
     */
    private static final byte[] secret = "geiwodiangasfdjsikolkjikolkijswe".getBytes();

    /**
     *
     * 创建token
     * @return
     * @throws JOSEException
     */
    public static String creatToeken(UserDetails userDetails) throws JOSEException {
        //建立一个头部
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS256);
        //设置一个载荷
        Payload payload = new Payload(new JSONObject(BeanMap.create(userDetails)));
        //创建对象
        JWSObject jwsObject = new JWSObject(jwsHeader, payload);
        //建立一个密钥
        JWSSigner macSigner = new MACSigner(secret);
        //签名
        jwsObject.sign(macSigner);
        return jwsObject.serialize();
    }
    public static UserDetails valid(String token) throws ParseException, JOSEException {
        //解析token
        JWSObject parse = JWSObject.parse(token);
        //获取载荷
        Payload payload = parse.getPayload();
        //建立解锁密钥
        MACVerifier macVerifier = new MACVerifier(secret);
        if(parse.verify(macVerifier)){
            JSONObject jsonObject = payload.toJSONObject();
            if(jsonObject.containsKey("exp")){
                Long expTime = Long.valueOf(jsonObject.get("exp").toString());
                long nowTime = System.currentTimeMillis();
                if(nowTime>expTime){
                    return null;
                }
            }
            return com.alibaba.fastjson.JSONObject.parseObject(jsonObject.toJSONString(),UserDetails.class);

        }
        return null;
    }
}
