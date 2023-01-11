package com.smartlab.boardlist.service;

import java.util.List;

import com.smartlab.boardlist.vo.FileBoardVO;

public interface FileBoardService {
  
    List<FileBoardVO> getFileBoardList();
    FileBoardVO fileBoardDetail(int b_no);
    int fileBoardInsert(FileBoardVO fileBoard);
    int fileBoardUpdate(FileBoardVO fileBoard);
    int fileBoardDelete(int bno);
    
}
