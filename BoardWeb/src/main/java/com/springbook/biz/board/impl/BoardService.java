package com.springbook.biz.board.impl;

import java.util.List;

import com.springbook.biz.board.BoardVO;

public interface BoardService {

	//	CRUD ����� �޼ҵ� ���� 
	//	�� ���
	void insertBoard(BoardVO vo);

	//	CRUD ����� �޼ҵ� ���� 
	//	�� ����
	void updateBoard(BoardVO vo);

	//	CRUD ����� �޼ҵ� ���� 
	//	�� ����
	void deleteBoard(BoardVO vo);

	//	CRUD ����� �޼ҵ� ���� 
	//	�� �� ��ȸ
	BoardVO getBoard(BoardVO vo);

	//	CRUD ����� �޼ҵ� ���� 
	//	�� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}