package com.xqj.nutojbackendmodel.model.dto.question;

import lombok.Data;

/**
 *  题目用例
 */
@Data
public class JudgeCase {
    /**
     *  输入用例
     */
    private String input;

    /**
     *  输入用例
     */
    private String output;
}
