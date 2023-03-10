package com.smartlab.boardlist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smartlab.boardlist.vo.FileBoardVO;
import com.smartlab.boardlist.vo.FileVO;

@Mapper
public interface FileBoardMapper {
  
  List<FileBoardVO> getFileBoardList(); //게시글 리스트 출력
  FileBoardVO fileBoardDetail(int b_no); //게시글 세부내용 보기
  int fileBoardInsert(FileBoardVO fileBoard); //게시글 생성
  int fileBoardUpdate(FileBoardVO fileBoard); //게시글 수정
  int fileBoardDelete(int bno); //게시글 삭제
  String fileSelect(int bno); //파일 조회
  
  //파일 업로드 및 다운로드 메서드 추가
  int fileInsert(FileVO file);
  FileVO fileDetail(int b_no);
  
}