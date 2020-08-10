package com.saketh.Assignment.models;

public class Request {
     String file_path;
     String file_name;
     String result_directory;
     Boolean prettyPrinting;

     public Request(String file_path, String file_name, String result_directory, Boolean prettyPrinting) {
          this.file_path = file_path;
          this.file_name = file_name;
          this.result_directory = result_directory;
          this.prettyPrinting = prettyPrinting;
     }

     public Boolean getPrettyPrinting() {
          return prettyPrinting;
     }

     public void setPrettyPrinting(Boolean prettyPrinting) {
          this.prettyPrinting = prettyPrinting;
     }

     public String getFile_path() {
          return file_path;
     }

     public void setFile_path(String file_path) {
          this.file_path = file_path;
     }

     public String getFile_name() {
          return file_name;
     }

     public void setFile_name(String file_name) {
          this.file_name = file_name;
     }

     public String getResult_directory() {
          return result_directory;
     }

     public void setResult_directory(String result_directory) {
          this.result_directory = result_directory;
     }
}