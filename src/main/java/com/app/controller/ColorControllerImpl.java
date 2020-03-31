/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import java.util.List;
import com.app.model.Color;
import com.app.service.ColorService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mitya
 */
@RestController
public class ColorControllerImpl implements ColorController {
    
    ColorService colorService;

    @Override
    public List<Color> findAllColors() {
       return colorService.findAllColors();
    }
    
}
