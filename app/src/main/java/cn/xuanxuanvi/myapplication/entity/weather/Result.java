/**
  * Copyright 2022 bejson.com 
  */
package cn.xuanxuanvi.myapplication.entity.weather;
import java.util.List;

/**
 * Auto-generated: 2022-06-12 17:10:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Result {

    private String city;
    private Realtime realtime;
    private List<Future> future;
    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setRealtime(Realtime realtime) {
         this.realtime = realtime;
     }
     public Realtime getRealtime() {
         return realtime;
     }

    public void setFuture(List<Future> future) {
         this.future = future;
     }
     public List<Future> getFuture() {
         return future;
     }

}