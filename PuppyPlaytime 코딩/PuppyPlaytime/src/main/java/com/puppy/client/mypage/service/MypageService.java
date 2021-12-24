package com.puppy.client.mypage.service;

import java.util.List;

import com.puppy.client.member.vo.MemberVO;
import com.puppy.client.reservation.vo.ReservationVO;
import com.puppy.common.vo.PetVO;

public interface MypageService {
	//펫관리
	public List<PetVO> petList();
	public int petInsert(PetVO pvo);
	public PetVO petDetail(PetVO pvo);
	public int petUpdate(PetVO pvo);
	public int petDelete(int p_no);
	
	//예약관리
	public List<ReservationVO> reservationList();
	
	//내정보
	public MemberVO myDetail(MemberVO mvo);
	public int myUpdate(MemberVO mvo);
}
