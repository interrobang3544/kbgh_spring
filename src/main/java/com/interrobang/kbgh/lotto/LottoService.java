package com.interrobang.kbgh.lotto;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LottoService {
    private final LottoRepository lottoRepository;

    public String getCurrentDrwNo() {
        return lottoRepository.getCurrentDrwNo();
    }

    @Transactional
    public Lotto getLotto(String drwNo) {
        Lotto existLotto = lottoRepository.findLotto(drwNo);
        if (existLotto == null) {
            Lotto lotto = lottoRepository.getLotto(drwNo);
            lottoRepository.save(lotto);
            return lotto;
        } else {
            return existLotto;
        }
    }
}
