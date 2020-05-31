/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class Suscribers implements Observer{
    private String susName;
	private Subject newsVideosObj;
	
	public Suscribers(String susName){
		this.susName=susName;
	}
	
	@Override
	public void update() {
		String msg = (String) newsVideosObj.getUpdate(this);
		if(msg == null){
			System.out.println(susName+":: No hay nuevos videos.");
		}else
		System.out.println(susName+":: Nuevo Video :"+msg);
	}
 
	@Override
	public void setSubject(Subject subjectObj) {
		this.newsVideosObj=subjectObj;
	}
}
