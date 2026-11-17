package com.demo.uersfservice;

public class Postf {

    private String postid;
    private String postAddress;
    private String postname;

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Postf(String postid, String postAddress, String postname) {
        this.postid = postid;
        this.postAddress = postAddress;
        this.postname = postname;
    }



}
