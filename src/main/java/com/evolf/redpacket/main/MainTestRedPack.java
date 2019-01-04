package com.evolf.redpacket.main;

import com.evolf.redpacket.GenRedPack;
import com.evolf.redpacket.GetRedPack;

public class MainTestRedPack {
	

	public static void main(String[] args) throws InterruptedException {
		GenRedPack.genHongBao();//初始化红包 (初始化完成才允许抢：即所有子线程都执行完)
		
		GetRedPack.getHongBao();//从红包池抢红包
	
	}
}