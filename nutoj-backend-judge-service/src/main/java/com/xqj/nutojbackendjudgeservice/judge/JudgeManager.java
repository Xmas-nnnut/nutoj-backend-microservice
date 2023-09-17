package com.xqj.nutojbackendjudgeservice.judge;

import com.xqj.nutojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.xqj.nutojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.xqj.nutojbackendjudgeservice.judge.strategy.JudgeContext;
import com.xqj.nutojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.xqj.nutojbackendmodel.model.codesandbox.JudgeInfo;
import com.xqj.nutojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
