package com.yujeong.basic.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + ", message = " + message);
    }

    //서비스 종료
    public void disConnect() {
        System.out.println("close: " + url);
    }

    public void init() {
        System.out.println("NeworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() {
        System.out.println("NeworkClient.close");
        disConnect();
    }
}
