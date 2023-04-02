package com.example.washyourdishes;

import android.content.Context;

import com.example.washyourdishes.objects.Resource;
import com.example.washyourdishes.objects.Role;
import com.example.washyourdishes.objects.Rule;
import com.example.washyourdishes.objects.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Globals {
    public static ArrayList<User> users = new ArrayList<User>();
    public static List<Rule> rulesList = new ArrayList<>();
    public static List<Resource> resourcesList = new ArrayList<>();

    public static void fillUserList(Context context) {
        try {
            InputStream inputStream = context.getAssets().open("users.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            String json = stringBuilder.toString();

            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                String userName = jsonObject.getString("userName");
                String photoName = jsonObject.getString("photo");
                int photoId = context.getResources().getIdentifier(photoName, "drawable", context.getPackageName());
                User user = new User(id, userName, photoId);
                users.add(user);
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    public static void fillResourceList(Context context) {
        try {
            InputStream is = context.getAssets().open("resources.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("resources");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject resourceObj = jsonArray.getJSONObject(i);
                String resourceName = resourceObj.getString("resource_name");
                String statusOfResource = resourceObj.getString("status_of_resource");
                Resource resource = new Resource(resourceName, statusOfResource);
                resourcesList.add(resource);
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    public static void fillRules(Context context) {
        try {
            InputStream inputStream = context.getAssets().open("rules.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            String json = new String(buffer, "UTF-8");

            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String activity = jsonObject.getString("activity");
                int points = jsonObject.getInt("points");
                Rule rule = new Rule(activity, points);
                rulesList.add(rule);
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
