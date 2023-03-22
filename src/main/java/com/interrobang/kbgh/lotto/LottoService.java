package com.interrobang.kbgh.lotto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LottoService {
    private final LottoRepository lottoRepository;

    public String getCurrentRound() {
        return lottoRepository.getCurrentRound();
    }

    public Lotto getLotto(String round) {
        return lottoRepository.getLotto(round);
    }
}
