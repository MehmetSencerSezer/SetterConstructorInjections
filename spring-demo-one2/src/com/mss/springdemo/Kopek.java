package com.mss.springdemo;

public class Kopek implements Hayvan {

	private GunlukYemekService gunlukYemekService;

	public Kopek() {
		super();
		System.out.println("Kopek : constroctur method");
	}

	@Override
	public String getAntreman() {
	return "5 km yüreyelim.";
	}

	@Override
	public String getGunlukYemek() {
		// TODO Auto-generated method stub
		return gunlukYemekService.getGunlukYemek();
	}

	public void setGunlukYemekService(GunlukYemekService gunlukYemekService) {
		System.out.println("Kopek: setter method");
		this.gunlukYemekService = gunlukYemekService;
	}
	
	
	
	


	
	
	
}
