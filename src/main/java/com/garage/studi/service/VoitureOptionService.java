package com.garage.studi.service;

import com.garage.studi.pojo.Option;
import com.garage.studi.pojo.VoitureOption;
import com.garage.studi.repository.VoitureOptionRepository;
import com.garage.studi.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoitureOptionService {

    @Autowired
    private VoitureOptionRepository voitureOptionRepository;

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> getAllOptionsByVoitureId(Long voitureId) {
        List<VoitureOption> voitureOption = this.voitureOptionRepository.findVoitureOptionByVoitureId(voitureId);
        List<Long> optionIds = voitureOption.stream()
                .map(voiture -> voiture.getVoitureOptionId().getOption_id())
                .collect(Collectors.toList());
        return optionRepository.findAllById(optionIds);
    }
}
