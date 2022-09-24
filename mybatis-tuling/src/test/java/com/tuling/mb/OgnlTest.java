package com.tuling.mb;

import com.tuling.entity.User;
import ognl.Ognl;
import ognl.OgnlException;
import org.apache.ibatis.scripting.xmltags.ExpressionEvaluator;
import org.junit.Test;

import java.util.Map;

/***

 */
public class OgnlTest {

    @Test
    public void ognlPlay() {
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();

        User user = new User();
        user.setId(1L);
        user.setUserName(null);

        boolean b = expressionEvaluator.evaluateBoolean("id>0 and username!=null", user);
        System.out.println(b);
    }



}
