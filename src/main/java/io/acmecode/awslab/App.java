package io.acmecode.awslab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        String value = System.getProperty( "title", "unknown" );
        logger.info( "Startup" );
        logger.info( String.format( "title: %s", value ) );
        logger.info( "Shutdown" );
    }
}
