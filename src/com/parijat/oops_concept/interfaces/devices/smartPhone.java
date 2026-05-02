package com.parijat.oops_concept.interfaces.devices;

// public class smartPhone extends camera, musicPlayer, phone -> can't extend multiple class
// Java doesn't support multiple inheritance

// Solved by Interfaces
// Multiple inheritance is Achieved
// Not Pure multiple inheritance

public class smartPhone implements camera,musicPlayer,phone{

    // Smartphone Implemented all the Abstract class

    @Override
    public void takePhoto() {
        System.out.println("Phone is taking Photo...");
    }

    @Override
    public void takeVideo() {
        System.out.println("Phone is taking Video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Phone is playing Music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Phone is stopping Music...");
    }

    @Override
    public void takeCall() {
        System.out.println("Phone is taking Call...");
    }

    @Override
    public void cutCall() {
        System.out.println("Phone is ending Call...");
    }
}
