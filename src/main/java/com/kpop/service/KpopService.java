package com.kpop.service;

import com.kpop.domain.KpopDomain;
import com.kpop.entry.KpopEntry;
import com.kpop.repository.KpopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KpopService {

    @Autowired
    KpopRepository repository;

    public Map<String, Object> search() {
        List<KpopDomain> kpopIdols = repository.findAll();
        Integer count = kpopIdols.size();
        List<KpopEntry> kpopIdolEntries = new ArrayList<KpopEntry>();
        for (KpopDomain domain : kpopIdols) {
            KpopEntry entry = new KpopEntry(domain);
            kpopIdolEntries.add(entry);
        }
        Map<String, Object> result = new HashMap<String, Object>() {{
            put("idols", kpopIdolEntries);
            put("total_count", count);
        }};
        return result;
    }

}
