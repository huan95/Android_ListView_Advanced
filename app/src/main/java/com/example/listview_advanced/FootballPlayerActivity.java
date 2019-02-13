package com.example.listview_advanced;

import android.support.v7.app.AppCompatActivity;

public class FootballPlayerActivity {
    public static class FootballPlayer {
        private String Name;
        private String Discription;
        private int Picture;

        public FootballPlayer(String name, String discription, int picture) {
            Name = name;
            Discription = discription;
            Picture = picture;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getDiscription() {
            return Discription;
        }

        public void setDiscription(String discription) {
            Discription = discription;
        }

        public int getPicture() {
            return Picture;
        }

        public void setPicture(int picture) {
            Picture = picture;
        }
    }
}
