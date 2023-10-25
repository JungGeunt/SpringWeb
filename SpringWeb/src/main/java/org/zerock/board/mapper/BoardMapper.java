package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.command.BoardVO;

public interface BoardMapper {

	public void insertBoard(BoardVO vo);//게시판 등록
	public boolean updateBoard(BoardVO vo);//게시판 수정
	public void deleteBoard(String num);//게시판 삭제
	public List<BoardVO> getList();//게시판 목록가져오기(모든)
	public BoardVO getContent(String num);//게시판 상세보기
	
}
