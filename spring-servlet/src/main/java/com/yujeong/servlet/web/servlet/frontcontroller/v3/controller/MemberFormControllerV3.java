package com.yujeong.servlet.web.servlet.frontcontroller.v3.controller;

import com.yujeong.servlet.web.servlet.frontcontroller.ModelView;
import com.yujeong.servlet.web.servlet.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
