/**
 * Created by Administrator on 2016/8/26.
 */
public class StringTest {

    public static void main(String[] args) {

       /* String str = "13612345678";
       // String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        String ss = str.substring(0,3)+"****"+str.substring(7);
        System.out.println(ss);

       byte[] byte1 =  str.getBytes();

        for(int i=0;i<byte1.length;i++){
            System.out.println(byte1[i]);
        }
*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("create table game_message(_id integer primary key autoincrement,")
                .append("imageurl text,")
                .append("gamename text,")
                .append("flag int,")
                .append("gamedetail text")
                .append(",date datetime")
                .append(",downloadurl text")
                .append(",showed int")
                .append(",delete int")
                .append(",gameid text)");
        /*String CREATE_MESSAGE = "create table game_message(_id integer primary key autoincrement," +
                "imageurl text," +
                "gamename text," +
                "flag int," +
                "gamedetail text" +
                ",date datetime" +
                ",downloadurl text" +
                ",showed int" +
                ",delete int" +
                ",gameid text)";*/

       /* long time = System.currentTimeMillis();


        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date(time);
        String tim = simpleDateFormat.format(date);*/
        System.out.println(stringBuffer.toString());


    }
}
