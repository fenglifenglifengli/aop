package com.fengli.AnnotationAspectJ;

import com.fengli.JDKDynamic.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/******************************************************************************
 * @Package: [com.fengli.AnnotationAspectJ.Main]
 * @ClassName: [Main]
 * @Description: [一句话描述该类的功能]
 * @Author: [fengli@founder.com.cn]  
 * @CreateDate: [2018/12/12 17:28]   
 * @UpdateUser: [fengli@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   
 * @UpdateDate: [2018/12/12 17:28，(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]
 * @Version: [v1.0]
 * ${tags}
 */
public class Main {
    public static void main(String argc[]){
        String xmlPath= "annotationAspectJ.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        //1 从spring获得内容
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        //执行方法
        userDao.save();
    }
}