package org.galsang.util.web.spring.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.galsang.util.web.http.IpKit;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;

/**
 * Description： 处理客户端请求拦截器: 消耗时间、客户端IP、请求参数等等
 * <br />Author： vimx86
 */
@Slf4j
public class ClientHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws
            Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        Long endTime = System.currentTimeMillis();
        Long handlingTime = new Long(endTime - startTime);
        String ip = IpKit.getIpAddr(request);


        StringBuilder uriLogInfo = new StringBuilder();
        uriLogInfo.append(" === 请求路径： ").append(ip).append(":").append(request.getLocalPort()).append(request.getRequestURI()).append(" "
                + "== ").append(request.getMethod());

        log.info(" ================== 开始 ======================= ");
        log.info(uriLogInfo.toString());

        Map<String, String[]> params = request.getParameterMap();
        if (params.size() != 0) {
            log.info(" === 请求参数为 ======================== " + params.size() + " 个！");
        }
        params.forEach((k, v) -> {
            StringBuilder paramLogInfo = new StringBuilder();
            paramLogInfo.append(" === 参数: ").append(k).append(" ==== ").append(Arrays.toString(v));
            log.info(paramLogInfo.toString());
        });

        log.info(" === 本次业务处理消耗时间： " + handlingTime + " ms");
        log.info(" ================== 结束 ======================= ");
    }

}
