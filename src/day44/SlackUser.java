package day44;

public class SlackUser {

    /**
     * Create a class called SlackUser
     * attributes :
     *     name, status( make it protected )
     * behaviours :
     *     sendMessage , callSomeone , addEmoji ,
     *
     * // crated it in different package
     * Create 1 subClass SlackAdminUser
     * attribute :
     *    adminId,
     * behaviour :
     *    sendAtChannelMessage , deleteMessage, addChannel, toString method
     *
     *    constructor : 3 args constructor to set all fields value
     *
     */

       protected String name;
       protected String status;

       public void sendMessage(){
           System.out.println("message sent to " + name);
       }
       public void callSomeone(){
           System.out.println("calling" + name + " now");
       }
       public void addEmoji(){
           System.out.println(name + "emoji added");
       }


}
