package com.nt.test;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class MyApp 
{
	private static Logger log=Logger.getLogger(MyApp.class);
    public static void main( String[] args ) throws Exception{
       //Layout layout=new SimpleLayout();
       //Layout layout=new HTMLLayout();
    	//Layout layout=new XMLLayout();
    	Layout layout=new PatternLayout("%d:: %r %p %C ::%M:: %m ::%n ");
       Appender ap=new FileAppender(layout,"app.log");
       log.addAppender(ap);
       log.info("status");
       log.debug("success::");
       log.error("exception");
       log.warn("warning");
       log.fatal("serious problem");
    }
}
