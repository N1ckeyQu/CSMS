package com.mdzy.page;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class PageObject<T> {

  private Long total;

  private Long pageIndex;

  private Long pageSize;

  private List<T> list;

  public void buildPage(List<T> list, Long total, Long pageIndex, Long pageSize) {
    this.list = list;
    this.total = total;
    this.pageIndex = pageIndex;
    this.pageSize = pageSize;
  }
}
