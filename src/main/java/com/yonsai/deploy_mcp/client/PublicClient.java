package com.yonsai.deploy_mcp.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "publicData", url = "https://apis.data.go.kr/1160100/service/GetSmallLoanFinanceInstituteInfoService")
public interface PublicClient {

  @GetMapping("/getOrdinaryFinanceInfo")
  Map<String, Object> getLoan(
      @RequestParam("serviceKey") String serviceKey,
      @RequestParam("pageNo") String pageNo,
      @RequestParam("numOfRows") String numOfRows,
      @RequestParam("resultType") String resultType);
}
