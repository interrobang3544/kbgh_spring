package com.interrobang.kbgh.lotto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class LottoRepository {
    public String getCurrentRound() {
        try {
            String url = "https://dhlottery.co.kr/common.do?method=main";
            return Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 Edg/111.0.1661.44")
                    .get()
                    .select("#lottoDrwNo")
                    .text();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Lotto getLotto(String round) {
        try {
            String url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=" + round;
            ObjectMapper mapper = new ObjectMapper();
            Lotto lotto = mapper.readValue(Jsoup
                    .connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 Edg/111.0.1661.44")
                    .get()
                    .body()
                    .text(), Lotto.class);
            return lotto;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
