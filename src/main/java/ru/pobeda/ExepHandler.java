package ru.pobeda;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class ControllerAdvisor {

    @Pointcut("@annotation(ru.pobeda.FuelExeptionHandler)")
    public void callAtAnnotatedMethods() {}

    @AfterThrowing ("callAtAnnotatedMethods()")
        public String doAfterEx(ProceedingJoinPoint pjp) throws Throwable{
        return "redirect:/errors";
    }
}
