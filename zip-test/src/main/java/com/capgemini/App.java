package com.capgemini;

import java.io.File;

import org.codehaus.plexus.archiver.zip.ZipUnArchiver;

public class App 
{
    public static void main( String[] args )
    {
     String filename = "zip-slip.zip";
     App example = new App();
     example.unPackZipFile(filename);
     
    }
    
    private void unPackZipFile(String filename)
    {
    	File file = new File(this.getClass().getClassLoader().getResource(filename).getFile());
    	   
        File unzipLocation = new File("/tmp/safeplace");
        ZipUnArchiver unzip = new ZipUnArchiver(file);
        unzip.extract(
       		 "../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../tmp/evil.txt",
       		 unzipLocation);
        System.out.println("Done");
    }
}