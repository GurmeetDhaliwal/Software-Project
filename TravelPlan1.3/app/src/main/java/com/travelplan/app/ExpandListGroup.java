package com.travelplan.app;
import java.util.ArrayList;
/**
 * Created by Gurmeet on 04/03/14.
 */
public class ExpandListGroup {

        private String Name;
        private ArrayList<ExpandListChild> Items;

        public String getName() {
            return Name;
        }
        public void setName(String name) {
            this.Name = name;
        }
        public ArrayList<ExpandListChild> getItems() {
            return Items;
        }
        public void setItems(ArrayList<ExpandListChild> Items) {
            this.Items = Items;
        }
 }

