package org.diophone.iPhone;

import org.diophone.iPhone.apps.browser.Browser;
import org.diophone.iPhone.apps.music.Music;
import org.diophone.iPhone.apps.phone.Phone;
import org.diophone.iPhone.devices.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        Music music = iphone;
        Phone phone = iphone;
        Browser browser = iphone;

        music.selectMusic("Red Room");
        phone.call("557799523764");
        browser.showPage("http://localhost:8080");
    }
}