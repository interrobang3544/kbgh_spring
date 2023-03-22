package com.interrobang.kbgh.lotto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LottoController {
    private final LottoService lottoService;

    @GetMapping("/lotto")
    public String lotto() {
        return "lotto";
    }

    @ResponseBody
    @GetMapping("lotto_current_round")
    public String getCurrentDrwNo() {
        return lottoService.getCurrentDrwNo();
    }

    @ResponseBody
    @GetMapping("lotto_search")
    public Lotto getLotto(String round) {
        return lottoService.getLotto(round);
    }
}
