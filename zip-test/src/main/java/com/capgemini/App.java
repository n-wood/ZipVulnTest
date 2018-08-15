package com.capgemini;

import java.io.File;

import org.codehaus.plexus.archiver.zip.ZipUnArchiver;

public class App 
{
    public static void main( String[] args )
    {
     
     String filename = "/Users/nathan/Applications/seccom/dodgyZip/zip-slip.zip";
     File unzipLocation = new File("/Users/nathan/Applications/seccom/safeplace");
     ZipUnArchiver unzip = new ZipUnArchiver(new File(filename));
     unzip.extract(
    		 "../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../tmp/evil.txt",
    		 unzipLocation);
     System.out.println("Done");
    }
}