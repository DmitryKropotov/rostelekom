/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Color;
import repository.ColorRepository;

/**
 *
 * @author mitya
 */
public class ColorServiceImpl implements ColorService {
    
    private ColorRepository colorRepository;

    @Override
    public List<Color> findAllColors() {
       return colorRepository.findAllColors();
    }
    
}
