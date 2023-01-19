package com.smartlab.boardlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlab.boardlist.vo.FileBoardVO;
import com.smartlab.boardlist.vo.FileVO;
import com.smartlab.boardlist.mapper.FileBoardMapper;

@Service
public class FileBoardServiceImpl implements FileBoardService {

  @Autowired
  FileBoardMapper fileboardmapper;
  
  @Override
  public List<FileBoardVO> getFileBoardList() {
    return fileboardmapper.getFileBoardList();
  }

  @Override
  public FileBoardVO fileBoardDetail(int b_no) {
    return fileboardmapper.fileBoardDetail(b_no);
  }

  @Override
  public int fileBoardInsert(FileBoardVO fileBoard) {
    return fileboardmapper.fileBoardInsert(fileBoard);
  }

  @Override
  public int fileBoardUpdate(FileBoardVO fileBoard) {
    return fileboardmapper.fileBoardUpdate(fileBoard);
  }

  @Override
  public int fileBoardDelete(int bno) {
    return fileboardmapper.fileBoardDelete(bno);
  }

  @Override
  public String fileSelect(int bno){
    return fileboardmapper.fileSelect(bno);
  }

    //파일 업로드 추가
    @Override
    public int fileInsert(FileVO file) {
      return fileboardmapper.fileInsert(file);
    }

    @Override
    public FileVO fileDetail(int b_no) {
      return fileboardmapper.fileDetail(b_no);
    }
}
