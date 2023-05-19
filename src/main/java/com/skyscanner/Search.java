package com.skyscanner;

public class Search {
  private String city;

  public Search(){

  }
  public Search(String city) {
      this.city = city;
  }

  public String getCity(){
      return city.toLowerCase();
  }

}
