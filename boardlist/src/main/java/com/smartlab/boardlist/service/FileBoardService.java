package com.smartlab.boardlist.service;

import java.util.List;

import com.smartlab.boardlist.vo.FileBoardVO;
import com.smartlab.boardlist.vo.FileVO;

public interface FileBoardService {
  
    List<FileBoardVO> getFileBoardList();
    FileBoardVO fileBoardDetail(int b_no);
    int fileBoardInsert(FileBoardVO fileBoard);
    int fileBoardUpdate(FileBoardVO fileBoard);
    int fileBoardDelete(int bno);
    String fileSelect(int bno);

  //파일 업로드 및 다운로드 메서드 추가
  int fileInsert(FileVO file);
  FileVO fileDetail(int b_no);
}
