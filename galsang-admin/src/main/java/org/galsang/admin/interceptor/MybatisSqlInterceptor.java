package org.galsang.admin.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.defaults.DefaultSqlSession.StrictMap;
import org.galsang.admin.base.model.AuthUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;


@Slf4j
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class MybatisSqlInterceptor implements Interceptor {

    @SuppressWarnings("rawtypes")
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];

        String sqlCommandType = mappedStatement.getSqlCommandType().name();

        String methodName = invocation.getMethod().getName();
        log.debug("方法名称 - ^_^ - methodName : " + methodName);

        if (methodName.equals("update")) {
            if ("INSERT".equals(sqlCommandType)) {
                Object parameter = invocation.getArgs()[1];

                if (parameter instanceof AuthUser) {
                    Date nowTime = new Date();
                    ((AuthUser) parameter).setCreatedTime(nowTime);
                    ((AuthUser) parameter).setUpdatedTime(nowTime);
                }

                log.debug("parameter拦截参数##- getName" + parameter.getClass().getName());
                log.debug("parameter拦截参数##- getSimpleName" + parameter.getClass().getSimpleName());
                log.debug("parameter拦截参数##- getTypeName" + parameter.getClass().getTypeName());

                /**
                 * 追踪MyBatis参数相关源码可知 设置List<Bean> 形式的参数
                 */
                if (parameter instanceof StrictMap) {
                    StrictMap map = (StrictMap) parameter;
                    ArrayList list = (ArrayList) map.get("list");
                    log.debug("拦截参数################（请）往下继续啊（亲）#############");
                    if (list.size() > 0 && list.get(0) instanceof AuthUser) {
                        log.debug("拦截参数################（请）开怀大笑（哈）#############");
                        Iterator iter = list.iterator();
                        while (iter.hasNext()) {
                            AuthUser vo = (AuthUser) iter.next();
                            Date nowTime = new Date();
                            vo.setCreatedTime(nowTime);
                            vo.setUpdatedTime(nowTime);
                        }
                    }
                }

            } else if ("UPDATE".equals(sqlCommandType)) {
                Object parameter = invocation.getArgs()[1];

                if (parameter instanceof AuthUser) {
                    Date nowTime = new Date();
                    ((AuthUser) parameter).setUpdatedTime(nowTime);
                }


                /**
                 * 追踪MyBatis参数相关源码可知 设置List<Bean> 形式的参数
                 */
                if (parameter instanceof StrictMap) {
                    StrictMap map = (StrictMap) parameter;
                    ArrayList list = (ArrayList) map.get("list");
                    log.debug("拦截参数################（请）往下继续啊（亲）#############");
                    if (list.size() > 0 && list.get(0) instanceof AuthUser) {
                        log.debug("拦截参数################（请）开怀大笑（哈）#############");
                        Iterator iter = list.iterator();
                        while (iter.hasNext()) {
                            AuthUser vo = (AuthUser) iter.next();
                            Date nowTime = new Date();
                            vo.setUpdatedTime(nowTime);
                        }
                    }
                }

            }
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

}
