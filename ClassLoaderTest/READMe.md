Set up required for this code to work. 

# Mysql JDBC Driver setup 

Go to Eclipse->Preference->Data Manager->Connectivity->Driver Definitions <br>
  In filter, search for MYSQL<br>
  Note the latest version of SQL in the list shown below.<br>
  You have to download the "sql-connector-java.jar" file for that version. (For me, it was 5.1)<br>
  Go to https://dev.mysql.com/downloads/connector/j/ <br>
  Go to archives and download the tar file for the corresponding version. (I downloaded for version 5.1.48)<br>
  Expand the compressed tar file and locate the .jar file there<br>
 
 Right click on your project in Eclipse<br>
 Go to Build Configurations<br>
 Go to Library<br>
 Select "Add external Library"<br>
 Browse to the location of the newly download jar file. <br>
 
