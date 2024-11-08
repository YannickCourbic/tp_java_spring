package com.api_spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.api_spring.config.Config;

/**
 * Hello world!
 *
 */
public class App extends AbstractAnnotationConfigDispatcherServletInitializer
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // Vous pouvez ajouter des classes de configuration si nécessaire
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {Config.class }; // Votre classe de configuration Web
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Tous les chemins d'URL sont gérés par le DispatcherServlet
    }
}
