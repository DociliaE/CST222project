/*This class stores location objects which contain an address, city, state, and zip code.
* Written by Docilia Eugene.
*/

package repair.appointments;

public class Location {
  String address;
  String city;
  String state;
  int zip;
  
  public void setAddress(String address){
    this.address= address;
  }
  public void setCity(String city){
    this.city= city;
  }
  public void setState(String state){
    this.state= state;
  }
  public void setZip(int zip){
    this.zip= zip;
  }
  public String getAddress(){
    return address;
  }
  public String getCity(){
    return city;
  }
  public String getState(){
    return state;
  }
  public int getZip(){
    return zip;
  }
  public String display(){
    return address + city + state + zip;
  }
  
}
