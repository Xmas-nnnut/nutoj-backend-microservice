package com.xqj.nutojbackendjudgeservice.judge.codesandbox.impl;


import com.xqj.nutojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.xqj.nutojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.xqj.nutojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
