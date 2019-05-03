import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import java.util.Scanner;

public class UserInfo {
    public static void main(String args[]){
//        String answer;
//        Scanner read_data = new Scanner(System.in);
//        System.out.println("Would you like to read date from json file(y/n): ");
//        answer = read_data.next();
//
//        if(answer == "y") {
//            System.out.println(JSONread());
//        }


        JSONObject json_write = JSONwrite();
        System.out.print(json_write);



    }


    public static JSONObject JSONwrite(){
        String user_name, password;

        Scanner user_key = new Scanner(System.in);
        System.out.println("Enter a username: ");
        user_name = user_key.next();


        Scanner pass_val = new Scanner(System.in);
        System.out.println("Enter a password: ");
        password = pass_val.next();

        JSONObject user = new JSONObject();
        user.put("username", user_name);
        user.put("password", password);

        try(FileWriter file = new FileWriter("/Users/nicholasrotondo/Desktop/user.json")) {
            file.write(user.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(user);
        return user;
    }

//    public static JSONParser JSONread(){
//        JSONParser read_user = new JSONParser();
//        try {
//
//            Object json_obj = read_user.parse(new FileReader("/Users/nicholasrotondo/Desktop/user.json"));
//
//            JSONObject jsonObject = (JSONObject) json_obj;
//            System.out.println(jsonObject);
//
//            String username = (String) jsonObject.get("username");
//            System.out.println(username);
//
//            String password = (String) jsonObject.get("password");
//            System.out.println(password);
//
//            // loop array
////            JSONArray msg = (JSONArray) jsonObject.get("messages");
////            Iterator<String> iterator = msg.iterator();
////            while (iterator.hasNext()) {
////                System.out.println(iterator.next());
////            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return read_user;
//    }
}

