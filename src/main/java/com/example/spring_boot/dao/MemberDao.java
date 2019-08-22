package com.example.spring_boot.dao;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
    public Object getObject(Object dataMap) {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("NAME", "name 02");
        return resultObject;
    }

    public class MemberService {
        private MemberDao dao;

    public Object getObject(Object dataMap) {
    Object resultObject = dao.getObject(dataMap);
    return resultObject;
    }