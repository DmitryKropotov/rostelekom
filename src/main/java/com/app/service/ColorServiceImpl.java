/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import java.util.List;
import com.app.model.Color;
import com.app.repository.ColorRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author mitya
 */
@Service
public class ColorServiceImpl implements ColorService {
    
    private ColorRepository colorRepository;

    @Override
    public List<Color> findAllColors() {
       return colorRepository.findAllColors();
    }
    
}
