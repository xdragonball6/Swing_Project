package com.javalec.function;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JLabel;



//	사용 방법
//	//실시간 시간 노출
//	private void timeSet() {
//		TimeStampFlow time = new TimeStampFlow(lblTime);
//		time.start();
//	}



public class TimeStampFlow extends Thread{
	private JLabel lbldTime;	
	
	public TimeStampFlow(JLabel lbldTime) {
		// TODO Auto-generated constructor stub
		this.lbldTime = lbldTime;
	}
	
	@Override
	public void run() {
		while(true) {
			// 현재 시스템 시간 구하기
			long systemTime = System.currentTimeMillis();
	
			// 출력 형태를 위한 formmater 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
			 
			// format에 맞게 출력하기 위한 문자열 변환
			lbldTime.setText(formatter.format(systemTime));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

